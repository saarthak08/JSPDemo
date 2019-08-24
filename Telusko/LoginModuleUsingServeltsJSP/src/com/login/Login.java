package com.login;

import com.login.utils.LoginDao;

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
        LoginDao loginDao=new LoginDao();
        if(uname!=null||pwd!=null) {
            if (loginDao.check(uname, pwd)) {
                    HttpSession session = req.getSession();
                    session.setAttribute("uname", uname);
                    resp.sendRedirect("welcome.jsp");
                }
            else{
                resp.sendRedirect("login.jsp");
            }
            }
        else {
            resp.sendRedirect("login.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
