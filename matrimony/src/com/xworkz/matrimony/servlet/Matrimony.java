package com.xworkz.matrimony.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/matri",loadOnStartup = 1)
public class Matrimony extends GenericServlet {
    public Matrimony() {
        System.out.println("object created");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service created");
        String name=servletRequest.getParameter("bridename");
        String age=servletRequest.getParameter("age");
        System.out.println("name of the bride"+name);
        System.out.println("age of the bride"+age);

        PrintWriter printWriter=servletResponse.getWriter();

        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("hiii..."+name);
        printWriter.println("<p style='color:red'>register successfully</p> ");
        printWriter.println("</body>");
        printWriter.println("</html>");
    }
}


