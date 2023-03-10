package servlets_jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PickNumber", urlPatterns = "/guess")
public class PIckNumber extends HttpServlet {
    private static final long serialVersionUID = 1L;

//    private int answer = pickAnswer();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/servlets-jsp/guess.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userNumber = request.getParameter("userNumber");
//        try/catch for test 1-3
//        yeilds /correct or /incorrect


        response.sendRedirect("/correct?number="+userNumber);
        System.out.println(userNumber);
    }
//    pickAnswer declared here
}


//correct servlet will have