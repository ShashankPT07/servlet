package com.xworkz.api.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/book", loadOnStartup = 1)
public class Book extends GenericServlet {

    public Book() {
        System.out.println("Book servlet loaded");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException {

        res.getWriter().print("Welcome to Book Servlet");
    }
}
