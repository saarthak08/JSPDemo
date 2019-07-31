package com.sg.DemoServlets.SendRedirect;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/addsr")
public class AddServletSendRedirect extends HttpServlet{
	public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
		int i=Integer.parseInt(httpServletRequest.getParameter("num1"));
		int j=Integer.parseInt(httpServletRequest.getParameter("num2"));
		
		int k=i+j;
		
		httpServletRequest.setAttribute("k", k);
		
		/* Setting attribute using Session Management
		HttpSession session=httpServletRequest.getSession();
		session.setAttribute("k", k);
		*/
		
		
		//Using Cookies
		Cookie cookie=new Cookie("k", k+"");
		httpServletResponse.addCookie(cookie);
		
		//httpServletResponse.sendRedirect("sqsr?k="+k); //Using URL Rewriting
		
		httpServletResponse.sendRedirect("sqsr"); 
	}


}
