package com.sg.DemoServlets.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SquareServletRequestDispatcher extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter writer=response.getWriter();
		writer.println("Hello to square!\n\n");
		int k=(int) request.getAttribute("k");
		writer.println("Resultant Sum: "+k);
		k=k*k;
		writer.println("Resultant square: "+k);

		ServletContext context=getServletContext();   //Servlet Context is common to all Servlets. There is only one servlet config
		String name=context.getInitParameter("Name");  //for all Servlets.
		writer.println("Hi "+name);

		ServletConfig servletConfig=getServletConfig();
		String nameConfig=servletConfig.getInitParameter("Name");
		writer.println("Hi " +nameConfig);    //This is particular to each & every Servlet. Each Servlet has its own Servlet Config.
	}


}
