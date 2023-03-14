import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/products")
public class ShowProductsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        // Use the factory to get the dao object
        Products productsDao = ProductDaoFactory.getProductsDao();
        // Use a method on the dao to get all the products
        List<Product> products = productsDao.all();
        // Pass the data to the jsp
        request.setAttribute("products", products);
        request.getRequestDispatcher("/products/productIndex.jsp").forward(request, resp);
    }

    public static void main(String[] args) {
        System.out.println(ProductDaoFactory.getProductsDao().all());
    }
}
