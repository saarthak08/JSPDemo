package com.sg.DemoServlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
		int i=Integer.parseInt(httpServletRequest.getParameter("num1"));
		int j=Integer.parseInt(httpServletRequest.getParameter("num2"));
		
		int k=i+j;
		/*System.out.println("Result : "+k);
		try {
			httpServletResponse.getWriter().println("Result: "+k);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//SessionManagement
		httpServletRequest.setAttribute("k", k);
		
		
		//RequestDispatcher
		RequestDispatcher requestDispatcher=httpServletRequest.getRequestDispatcher("sq");
		requestDispatcher.forward(httpServletRequest, httpServletResponse);
	}

}
