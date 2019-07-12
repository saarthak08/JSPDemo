package com.sg.DemoServlets.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

public class SquareServletRequestDispatcher extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter writer=response.getWriter();
		writer.println("Hello to square!\n\n");
		int k=(int) request.getAttribute("k");
		writer.println("Resultant Sum: "+k);
		k=k*k;
		writer.println("Resultant square: "+k);
	}

}
