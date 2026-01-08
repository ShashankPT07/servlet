package com.xworkz.twitter.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/tweet",loadOnStartup = 1)
public class Twitter extends HttpServlet {
    public Twitter() {
        System.out.println("twitter created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String user= req.getParameter("username");
       String pass=req.getParameter("password");
        System.out.println("name of the user"+user);
        System.out.println("password of the user"+pass);
    }
}
