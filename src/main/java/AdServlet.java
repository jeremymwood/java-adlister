import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ads")
public class AdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        Ads adsDao = DaoFactory.getAdsDao();
        List<Ad> ads = adsDao.all();
        request.setAttribute("ads", ads);
        request.getRequestDispatcher("/ads/index.jsp").forward(request, resp);
    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Products productsDao = DaoFactory.getProductsDao();
//        // create a new product based on the submitted data
//        String name = request.getParameter("name");
//        double price = Double.parseDouble(request.getParameter("price"));
//        Product product = new Product(name, price);
//        // persist the new product
//        productsDao.insert(product);
//        response.sendRedirect("/products");
//    }
}
