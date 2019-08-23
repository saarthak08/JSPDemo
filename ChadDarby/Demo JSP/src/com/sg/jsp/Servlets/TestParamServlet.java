package com.sg.jsp.Servlets;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/testParamServlet")
public class TestParamServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context=getServletContext();  //Context is common to all Servlets but config is particular to each
        String paramCartSize=context.getInitParameter("max-shopping-cart-size");   //servlet.
        String paramTeamName=context.getInitParameter("project-team-name");
        PrintWriter out=resp.getWriter();
        out.println("Max Shopping Cart Size: "+paramCartSize);
        out.println("Project Team Name: "+paramTeamName);
    }
}
