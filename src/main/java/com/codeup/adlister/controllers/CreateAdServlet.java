package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.CreateAdServlet", urlPatterns = "/ads/create")
public class CreateAdServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/ads/create.jsp")
                .forward(request, response);
    }

//    Prom dress, $200 OBO
//    Budget conscious option.
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        User user = DaoFactory.getUsersDao().findByUsername(username);
        long sess_id = user.getId();

        Ad ad = new Ad(
                12,
//                sess_id,
                request.getParameter("title"),
                request.getParameter("description")
        );

        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/ads/create");
        } else {
//            ad.setadUser_id(user.getId());
            DaoFactory.getAdsDao().insert(ad);
            response.sendRedirect("/ads");
        }

        System.out.println(ad.getadUser_id());
    }

}
