package eseo.hotel.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
				String telephone = request.getParameter("telephone");
				String arrivee = request.getParameter("dateArrivee");
				String depart = request.getParameter("dateDepart");
				String chambre = request.getParameter("chambre");
				
	}
	
}
