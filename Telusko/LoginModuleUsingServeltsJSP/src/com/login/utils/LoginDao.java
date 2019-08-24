package com.login.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
    public boolean check(String uname, String pwd){
        String sql="select * from login where uname = ? and pass = ?";
        String url="jdbc:mysql://localhost:3306/Saarthak";
        String username="Saarthak";
        String password="12345689";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,uname);
            preparedStatement.setString(2,pwd);
            ResultSet res=preparedStatement.executeQuery();
            if(res.next()){
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
