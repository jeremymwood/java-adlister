package servlets_jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "PizzaOrder", urlPatterns = "/pizza-order")
//@WebServlet(name = "PizzaOrder", urlPatterns = "/pizza-order")
public class PizzaOrder extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.getRequestDispatcher("/servlets-jsp/pizza.jsp").forward(request, response);

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String crustSelection=request.getParameter("crustSelection");
//        String toppings=request.getParameter("toppings");
//        if(crustSelection){
            HttpSession session=request.getSession(true);
            session.setAttribute("crustSelection", crustSelection);
////            session.setAttribute("toppings", toppings);
//////            response.getWriter().append("Login SucessFully");
////            response.sendRedirect("profile.jsp"); //error
//        } else{
////            response.sendRedirect("login.jsp"); //error
//            HttpSession  session=request.getSession(true);
//            session.setAttribute("errorMessage", "Login Failed");
////            //refresh examples reset to false
//        }
        //doGet(request, response);
        request.getRequestDispatcher("/servlets-jsp/pizza.jsp").forward(request, response);
        System.out.println("connected");
//        System.out.println(crustSelection);
    }
}