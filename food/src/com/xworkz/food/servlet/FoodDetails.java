package com.xworkz.food.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/foo",loadOnStartup = 1)
public class FoodDetails extends HttpServlet {
    public FoodDetails() {
        System.out.println("food is ready");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("this is doget");
        System.out.println(req.getParameter("food"));
        System.out.println(req.getParameter("rating"));
    }
}
