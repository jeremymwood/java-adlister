package servlets_jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;

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
        String crustSelection = request.getParameter("crustSelection");
//        String toppingSelection = Arrays.toString(request.getParameterValues("toppingSelection"));
        String toppingSelection = Arrays.toString(request.getParameterValues("toppingSelection"));
        String name = request.getParameter("name");
//        String toppings=request.getParameter("toppings");
//        if(crustSelection){
            HttpSession session=request.getSession(true);
            session.setAttribute("crustSelection", crustSelection);
            session.setAttribute("toppingSelection", toppingSelection);
            session.setAttribute("name", name);
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
        System.out.println(crustSelection);
        System.out.println(toppingSelection);
        System.out.println(name);
    }
}