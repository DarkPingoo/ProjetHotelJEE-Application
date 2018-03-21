package eseo.hotel.servlets;

import eseo.hotel.utils.TemplateUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class reservationServlet
 */
@WebServlet("/etatReservation")
public class etatReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public etatReservation() {
		super();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Redirection vers la Servlet de gestion des reservation
		request.getRequestDispatcher("/gererReservation").forward(request, response);
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Requête d'annulation de réservation
		String idReservation 	= request.getParameter("idReservation");


		//TODO : APPEL DU WEBSERVICE - payerChambre reservation
		boolean exists  = (idReservation.contains("1234")),
                payee   = (idReservation.contains("5")); //TEST
		//estionHotelsSEI service = new GestionHotelsService().getGestionHotelsPort();
		//boolean resultat = true;//service.annulerChambre(Integer.parseInt(idReservation));

		String callbackType 	= null;
		String callbackMessage 	= null;
		if(exists) {
		    if(payee) {
                callbackType 	= "success";
                callbackMessage = "La réservation n°" + idReservation + " est déjà réglée, tout est bon !";
            } else {
                callbackType 	= "warning";
                callbackMessage = "La réservation n°" + idReservation + " n'est pas encore payée, pensez-y !";
            }
		} else {
			callbackType 	= "danger";
			callbackMessage = "La réservation n°" + idReservation + " n'existe pas !";
		}

		TemplateUtil.setCallback(request, response, callbackType, callbackMessage);
		doGet(request, response);
	}
}
