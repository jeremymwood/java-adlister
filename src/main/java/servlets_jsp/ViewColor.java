package servlets_jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ViewColor", urlPatterns = "/correct")
public class ViewColor extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("userNumber", request.getParameter("number"));
        request.getRequestDispatcher("/servlets-jsp/correct.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("/servlets-jsp/correct.jsp"); //error
        HttpSession session = request.getSession(true);
        request.getRequestDispatcher("/servlets-jsp/correct.jsp").forward(request, response);
    }
}