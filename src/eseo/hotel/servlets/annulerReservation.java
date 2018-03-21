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
@WebServlet("/annulerReservation")
public class annulerReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public annulerReservation() {
		super();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Définir des variables

		//Forward vers la page de template
		TemplateUtil.showPage(request, response, "annulerReservation.jsp", "Annuler une réservation");
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Requête d'annulation de réservation
		String idReservation = request.getParameter("id");

		//TODO : APPEL DU WEBSERVICE - Annulation reservation
		boolean result = false;
		//estionHotelsSEI service = new GestionHotelsService().getGestionHotelsPort();
		//boolean resultat = true;//service.annulerChambre(Integer.parseInt(idReservation));

		//Renvoi du résultat
		request.setAttribute("callbackType", result ? "success" : "");
		request.setAttribute("callbackMessage", "success");

		doGet(request, response);
	}
}
