package servlets;

import DAO.PersonDaoFactory;
import DAO.PersonListDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "personServlet", urlPatterns = "/person.jsp")
public class personServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PersonListDAO dao = PersonDaoFactory.getPersonDAO();

        request.setAttribute("people", dao.all());
        request.getRequestDispatcher("/person.jsp").forward(request, response);
    }
}

