package com.xworkz.swiggy.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/swigg",loadOnStartup = 1)
public class Swiggy extends HttpServlet {
    public Swiggy() {
        System.out.println("swiggy object");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


            String restaurant = req.getParameter("r1");
            String food = req.getParameter("f1" );
            String location = req.getParameter("l1" );
            String rating = req.getParameter("ra1" );

            System.out.println("----- Restaurant "  + " -----");
            System.out.println("Name     : " + restaurant);
            System.out.println("Food     : " + food);
            System.out.println("Location : " + location);
            System.out.println("Rating   : " + rating);


    }
}
