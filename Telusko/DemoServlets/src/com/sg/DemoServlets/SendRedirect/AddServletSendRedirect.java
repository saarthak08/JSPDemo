package com.sg.DemoServlets.SendRedirect;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServletSendRedirect extends HttpServlet{
	public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
		int i=Integer.parseInt(httpServletRequest.getParameter("num1"));
		int j=Integer.parseInt(httpServletRequest.getParameter("num2"));
		
		int k=i+j;
		
		httpServletRequest.setAttribute("k", k);		
		
		httpServletResponse.sendRedirect("sqsr?k="+k); //URL Rewriting
		
	}


}
