package com.login;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Login")
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname=req.getParameter("uname");
        String pwd=req.getParameter("pwd");
        if(uname!=null||pwd!=null) {
            if (uname.equals("Saarthak") && pwd.equals("123")) {
                HttpSession session = req.getSession();
                session.setAttribute("uname", uname);
                resp.sendRedirect("welcome.jsp");
            } else {
                resp.sendRedirect("login.jsp");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
