package com.mohamedprogramming.empapp;

import java.sql.Connection;
import java.sql.DriverManager;

import static java.sql.DriverManager.*;

public class DBConnection {
    static Connection con;
    public static Connection createDBConnection(){
        try{
            // load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // get connection    jdbc:mysql://localhost:3306/mysql
            String url="jdbc:mysql://localhost:3306/empolyeedb";
            String userName="root";
            String password="";
            con= DriverManager.getConnection(url,userName,password);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return  con;
    }
}
