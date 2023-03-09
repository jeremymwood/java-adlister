package servlets_jsp;

import javax.print.attribute.standard.PresentationDirection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ViewColor", urlPatterns = "/viewcolor")
public class ViewColor extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("favoriteColor", request.getParameter("color"));
        request.getRequestDispatcher("/servlets-jsp/viewcolor.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("/servlets-jsp/viewcolor.jsp"); //error
//        String favoriteColor = request.getParameter("favoriteColor");
        HttpSession session = request.getSession(true);
//
        request.getRequestDispatcher("/servlets-jsp/viewcolor.jsp").forward(request, response);

    }
}