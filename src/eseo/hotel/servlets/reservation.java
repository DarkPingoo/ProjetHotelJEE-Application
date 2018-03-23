package eseo.hotel.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import eseo.hotel.clientws.GestionHotelsSEI;
import eseo.hotel.clientws.GestionHotelsService;
import eseo.hotel.clientws.ReservationChambre;
import eseo.hotel.utils.TemplateUtil;

/**
 * Servlet implementation class reservation
 */
@WebServlet("/reservation")
public class reservation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public reservation() {
		super();
		// TODO Auto-generated constructor stub
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
		String chambre = request.getParameter("chambre");
		String nbPers = request.getParameter("nbPers");
		
		//GregorianCalendar
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        GregorianCalendar cd = new GregorianCalendar();
        GregorianCalendar cf = new GregorianCalendar();
        try {
			cd.setTime(sdf.parse(arrivee));
			cf.setTime(sdf.parse(depart));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        XMLGregorianCalendar dateD = null;
        XMLGregorianCalendar dateF = null;
		try {
			dateD = DatatypeFactory.newInstance().newXMLGregorianCalendar(cd);
			dateF = DatatypeFactory.newInstance().newXMLGregorianCalendar(cf);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		        
		
		//Connexion au WEB SERVICE - reserverChambre()
		GestionHotelsSEI service = new GestionHotelsService().getGestionHotelsPort();
		
		// TODO Chambre
		int idChambre = 1;
		
		ReservationChambre reservation = new ReservationChambre();
		if(identifiant != null) {
			reservation.setIdClient(Integer.parseInt(identifiant));	
		}
		//TODO : trouverChambre --> idChambre
		reservation.setIdChambre(idChambre);
		if(arrivee != null) {
			reservation.setDateDebut(dateD);
		}
		if(depart != null) {
			reservation.setDateFin(dateF);
		}
		if(nbPers != null) {
			reservation.setNbPlaces(Integer.parseInt(nbPers));
		}
		
		String callbackType;
		String callbackMessage;
		if(service.reserverChambre(reservation) > 0) {
			callbackType 	= "success";
            callbackMessage = "La réservation pour " + chambre + " du " + arrivee + " au " + depart +
            		" a bien été effectuée " + sexe + " " + prenom + " " + nom + ".";
		}else {
			callbackType 	= "danger";
            callbackMessage = "La réservation pour " + chambre + " du " + arrivee + " au " + depart +
            		" n'a pas pu être effectuée " + sexe + " " + prenom + " " + nom + ".";
		}

		TemplateUtil.setCallback(request, response, "success", "Votre réservation à bien été prise en compte " 
				+ sexe + " " + prenom + " " + nom + ".");

		doGet(request, response);
	}

}
