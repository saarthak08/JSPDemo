package com.sg.jsp.Servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Servlets/readingFormData")
public class ReadingFormData extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName=(String)req.getParameter("firstName");
        String lastName=(String)req.getParameter("lastName");
        PrintWriter out=resp.getWriter();
        out.println("First Name: "+ firstName);
        out.println("Last Name: "+lastName);
    }
}
