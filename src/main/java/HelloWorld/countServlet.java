package HelloWorld;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "countServlet", urlPatterns = "/count")
public class countServlet extends HttpServlet {

    private int count= 0;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

//        String reset = request.getParameter("reset");
//        if (reset != null && reset.equalsIgnoreCase()) {
//
//        }
//        count++;
//
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>" + count + "</h1>");


    }

}
//    private Person person = null;
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//
//        System.out.println("working");
//
//
//        String name = request.getParameter("name");
//        String age = request.getParameter("age");
////        System.out.println(name + " " + age);
//        if(age == null) {
//            response.sendRedirect("https://google.com");
//            return;
//        }
//
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//
//        if(person == null) {
//            System.out.println("making bob!!");
//            person = new Person("bob");
//        }
//
//        out.println("<h1>" + person + "</h1>");
//    }

//}