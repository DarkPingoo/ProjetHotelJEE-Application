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
     * @param titre Titre de la page <titre></titre>
     * @throws ServletException Exception
     * @throws IOException Exception
     */
    public static void showPage(HttpServletRequest request, HttpServletResponse response, String pageName, String titre)
            throws ServletException, IOException {

        //Définition de la page à inclure dans la variable
        request.setAttribute("page_to_include", pageName);
        request.setAttribute("titre_page", titre);
        request.setAttribute("servletPath", request.getServletPath());
        //Forward vers la page de template
        request.getRequestDispatcher("/WEB-INF/template.jsp").forward(request, response);
    }

    public static void setCallback(HttpServletRequest request, HttpServletResponse response, String type, String message) {
        //Mise en forme du message
        String icon = type.equalsIgnoreCase("success") ? "check" :
                        type.equalsIgnoreCase("danger") ? "times" :
                        type.equalsIgnoreCase("warning") ? "exclamation-triangle" : "info-circle";


        //Définition du callback
        request.setAttribute("callbackType", type);
        request.setAttribute("callbackIcon", icon);
        request.setAttribute("callbackMessage", message);
    }
}
