package servlets_jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "PickColor", urlPatterns = "/pickcolor")
public class PickColor extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/servlets-jsp/pickcolor.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String favoriteColor = request.getParameter("favoriteColor");
//        HttpSession session=request.getSession(true);
//        session.setAttribute("favoriteColor", favoriteColor);

//        request.getRequestDispatcher("/servlets-jsp/pickcolor.jsp").forward(request, response);
        response.sendRedirect("/viewcolor?color="+favoriteColor);
        System.out.println(favoriteColor);
    }
}