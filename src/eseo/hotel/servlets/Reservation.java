package eseo.hotel.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import eseo.hotel.clientws.Chambre;
import eseo.hotel.clientws.GestionHotelsSEI;
import eseo.hotel.clientws.GestionHotelsService;
import eseo.hotel.clientws.ReservationChambre;
import eseo.hotel.utils.TemplateUtil;
import eseo.parking.clientws.RequetesBDDService;

//TODO : Faire des tests (web & ws)

/**
 * Servlet implementation class Reservation
 */
@WebServlet("/reservation")
public class Reservation extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reservation() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Definition des differentes chambres disponibles
        ArrayList <String> chambreList = new ArrayList<String>();
        chambreList.add("Suite Royale");
        chambreList.add("Chambre d'Affaire");
        chambreList.add("Chambre Familiale");
        chambreList.add("Taudis");

        request.setAttribute("chambreList", chambreList);

        TemplateUtil.showPage(request, response, "reservation.jsp", "Réserver une chambre");

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Recuperation des données
        String sexe = request.getParameter("sexe");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String identifiant = request.getParameter("idHotel");
        String telephone = request.getParameter("telephone");
        String arrivee = request.getParameter("dateArrivee");
        String depart = request.getParameter("dateDepart");
        String typeChambre = request.getParameter("chambre");
        String nbPers = request.getParameter("nbPers");
        boolean reserverParking = request.getParameter("parking").equalsIgnoreCase("oui");

        //GregorianCalendar
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        GregorianCalendar cd = new GregorianCalendar();
        GregorianCalendar cf = new GregorianCalendar();
        try {
            cd.setTime(sdf.parse(arrivee));
            cf.setTime(sdf.parse(depart));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        XMLGregorianCalendar dateD = null;
        XMLGregorianCalendar dateF = null;
        try {
            dateD = DatatypeFactory.newInstance().newXMLGregorianCalendar(cd);
            dateF = DatatypeFactory.newInstance().newXMLGregorianCalendar(cf);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }

        //Préparation du message de retour
        String callbackType;
        String callbackMessage;

        //Connexion au WEB SERVICE - reserverChambre()
        GestionHotelsSEI service = null;

        try {
            service = new GestionHotelsService().getGestionHotelsPort();
        } catch(Exception e) {
            e.printStackTrace();
        }

        if(service != null) {
            Chambre chambre = new Chambre();
            chambre.setNbLits(Integer.parseInt(nbPers));
            chambre.setTypeChambre(typeChambre);

            List<Chambre> chambresDispo = service.trouverChambre(chambre);
            if(chambresDispo.size() > 0) {
                chambre = chambresDispo.get(0);
                ReservationChambre reservation = new ReservationChambre();

                if(identifiant != null) {
                    reservation.setIdClient(Integer.parseInt(identifiant));
                    reservation.setIdChambre(chambre.getIdChambre());
                    if(arrivee != null) {
                        reservation.setDateDebut(dateD);
                        if(depart != null && dateF.compare(dateD) == DatatypeConstants.GREATER) {
                            reservation.setDateFin(dateF);
                            if(nbPers != null) {
                                reservation.setNbPlaces(Integer.parseInt(nbPers));
                                try {
                                    int codeRetour = service.reserverChambre(reservation);
                                    if(codeRetour > 0) {
                                        callbackType 	= "success";
                                        callbackMessage = "La réservation pour " + chambre.getTypeChambre() + " du " + arrivee + " au " + depart +
                                                " a bien été effectuée " + sexe + " " + prenom + " " + nom + ". ";
                                        callbackMessage += "\nPensez à régler votre réservation qui est d'un montant de " + chambre.getPrix() + "€";
                                        callbackMessage += "\nVotre réservation porte l'identifiant n°" + codeRetour;

                                        //Réservation du parking - Utilisation d'un WS externe
                                        if(reserverParking) {
                                            eseo.parking.clientws.Reservation parking = new eseo.parking.clientws.Reservation();
                                            parking.setCodeClient(Integer.parseInt(identifiant));
                                            parking.setCodeParking(1);
                                            parking.setDateDebut(dateD);
                                            parking.setDateFin(dateF);
                                            parking.setPaiementEffectue(true);

                                            new RequetesBDDService().getRequetesBDDPort().reserverParking(parking);
                                        }
                                    }else {
                                        callbackType 	= "danger";

                                        //Affichage du message en fonction du code d'erreur
                                        /*
                                         * -1 : Incohérence de date
                                         * -2 : Chambre inexistante
                                         * -3 : Chambre déjà réservée
                                         */
                                        if(codeRetour == -1) {
                                            callbackMessage = "Merci de vérifier vos date de réservation";
                                        } else if (codeRetour == -2) {
                                            callbackMessage = "Désolé, nous ne possédons plus de chambre " + chambre.getTypeChambre();
                                        } else if (codeRetour == -3) {
                                            callbackMessage = "Désolé, la chambre " + chambre.getTypeChambre() + " est déjà réservée pour la période " +
                                                    "du " + getDateFormatee(reservation.getDateDebut()) + " au " + getDateFormatee(reservation.getDateFin());
                                        } else {
                                            callbackMessage = "Problème interne, impossible de réserver la chambre";
                                        }
                                    }
                                } catch(Exception e) {
                                    callbackType        = "warning";
                                    callbackMessage     = "Impossible de contacter le serveur de réservation";
                                }
                            }else {
                                callbackType 	= "danger";
                                callbackMessage = "Combien serez vous ?";
                            }
                        }else {
                            callbackType 	= "danger";
                            callbackMessage = "A quelle date repartez-vous ?";
                        }
                    }else {
                        callbackType 	= "danger";
                        callbackMessage = "A quelle date arrivez-vous ?";
                    }
                }else {
                    callbackType 	= "danger";
                    callbackMessage = "Quel est votre identifiant ?";
                }
            } else {
                callbackType    = "danger";
                callbackMessage = "Aucune chambre " + chambre.getTypeChambre() + " n'est disponible pour cette période pour " + nbPers + " personnes";
            }
        } else {
            callbackType        = "warning";
            callbackMessage     = "Impossible de contacter le serveur de réservation";
        }


        //Si la requête ne reussit pas on remet les parametres dans les inputs
        if(!callbackType.equalsIgnoreCase("success")) {
            request.setAttribute("sexe", request.getParameter("sexe"));
            request.setAttribute("nom", request.getParameter("nom"));
            request.setAttribute("prenom", request.getParameter("prenom"));
            request.setAttribute("idHotel", request.getParameter("idHotel"));
            request.setAttribute("telephone", request.getParameter("telephone"));
            request.setAttribute("dateArrivee", request.getParameter("dateArrivee"));
            request.setAttribute("dateDepart", request.getParameter("dateDepart"));
            request.setAttribute("chambre", request.getParameter("chambre"));
            request.setAttribute("nbPers", request.getParameter("nbPers"));
        }

        TemplateUtil.setCallback(request, response, callbackType, callbackMessage);

        doGet(request, response);
    }


    public String getDateFormatee(XMLGregorianCalendar date) {
        return date.getDay() + "/" + date.getMonth() + "/" + date.getYear();
    }

}
