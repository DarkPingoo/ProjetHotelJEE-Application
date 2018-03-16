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
@WebServlet("/affichageReservation")
public class affichageReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public affichageReservation() {
        super();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//TODO
		//Définir des variables
		request.setAttribute("variableA", request.getParameter("var"));

		//Forward vers la page de template
		TemplateUtil.showPage(request, response, "affichageReservation.jsp", "Suivre une réservation");
	}

}
