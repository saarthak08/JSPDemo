package com.sg.jsp.MVC;

import com.sg.jsp.MVC.model.Student;
import com.sg.jsp.MVC.model.StudentDataUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpClient;
import java.util.List;


@WebServlet("/mvcServlet")
public class MVCServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Student> students= StudentDataUtil.getSudents();
        req.setAttribute("students_list",students);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("/MVC/view_students.jsp");
        requestDispatcher.forward(req,resp);

    }
}
