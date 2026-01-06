package com.xworkz.api.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/pen", loadOnStartup = 2)
public class Pen extends GenericServlet {

    public Pen() {
        System.out.println("Pen servlet loaded");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException {

        res.getWriter().print("Welcome to Pen Servlet");
    }
}
