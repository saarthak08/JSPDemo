package com.sg.DemoServlets.SendRedirect;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.CookieStore;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServletSendRedirect extends HttpServlet {
	int k;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter writer=response.getWriter();
		writer.println("Hello to square!\n\n");
		
		
		/* Retrieving Value using Session Management
		HttpSession session=request.getSession();
		int k=(int) session.getAttribute("k");
		*/

		//Using Cookies
		 Cookie[] cookies=request.getCookies();
		 for(Cookie c:cookies) {
			 if(c.getName().equals("k")) {
				 k=Integer.parseInt(c.getValue());
			 }
		 }
		
		
		//int k=Integer.parseInt(request.getParameter("k"));
		
		
		writer.println("Resultant Sum: "+k);
		k=k*k;
		writer.println("Resultant square: "+k);
		
		//session.removeAttribute("k");

		ServletContext context=getServletContext();
		String phone=context.getInitParameter("Phone");
		writer.println("Hi, you are using a phone of "+phone);
	}

}
