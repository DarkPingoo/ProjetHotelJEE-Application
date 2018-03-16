package eseo.hotel.utils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TemplateUtil {

    /**
     * Forward la requête vers le template et affiche la page demandée
     * @param request Request
     * @param response Response
     * @param pageName Nom de la page.jsp, localisée dans /WEB-INF/pages/
     * @throws ServletException Exception
     * @throws IOException Exception
     */
    public static void showPage(HttpServletRequest request, HttpServletResponse response, String pageName)
            throws ServletException, IOException {

        //Définition de la page à inclure dans la variable
        request.setAttribute("page_to_include", pageName);
        //Forward vers la page de template
        request.getRequestDispatcher("/WEB-INF/template.jsp").forward(request, response);
    }
}
