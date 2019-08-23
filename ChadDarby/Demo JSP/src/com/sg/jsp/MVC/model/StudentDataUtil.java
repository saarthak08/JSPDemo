package com.sg.jsp.MVC.model;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {


    public static List<Student> getSudents(){

        List<Student> students=new ArrayList<>();
        students.add(new Student("Saarthak","Gupta","saarthakgupta08@gmail.com"));
        students.add(new Student("John","Doe","johndoe@gmail.com"));
        students.add(new Student("Ajay","Vimal","kesarkadum@gmail.com"));

        return students;

    }

}
