package eseo.hotel.servlets;

import eseo.hotel.clientws.GestionHotelsSEI;
import eseo.hotel.clientws.GestionHotelsService;
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
		//Requête de vérification de réservation
		String idReservationStr = request.getParameter("idReservation");
		Integer idReservation   = null;
		String callbackType 	= null;
		String callbackMessage 	= null;

		//Conversion de l'ID en integer
		try {
			idReservation = Integer.parseInt(idReservationStr);
		} catch(NumberFormatException ignored) {}

		//Si les paramètres sont valides
		if(idReservation != null) {
			//APPEL DU WEBSERVICE - PayerReservation
			GestionHotelsSEI service    = new GestionHotelsService().getGestionHotelsPort();

			callbackType 	= "info";
			callbackMessage = service.payerChambre(idReservation);
		} else {
			callbackType 	= "danger";
			callbackMessage = "Le numéro de réservation est invalide !";
		}

		TemplateUtil.setCallback(request, response, callbackType, callbackMessage);
		doGet(request,response);
	}
}
