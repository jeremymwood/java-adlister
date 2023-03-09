package HelloWorld;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", value = "/jmw")
public class HelloWorldServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Essentials:";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<ul>" +
                "<li>Monkey</li>" +
                "<li>Avocado</li>" +
                "<li>Screwdriver</li>" +
                "</ul>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
