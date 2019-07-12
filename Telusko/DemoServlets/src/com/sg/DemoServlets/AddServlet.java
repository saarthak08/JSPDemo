package com.sg.DemoServlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddServlet extends HttpServlet {
	
	public void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		int i=Integer.parseInt(httpServletRequest.getParameter("num1"));
		int j=Integer.parseInt(httpServletRequest.getParameter("num2"));
		
		int k=i+j;
		System.out.println("Result : "+k);
		try {
			httpServletResponse.getWriter().println("Result: "+k);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
