package com.mohamedprogramming.empapp;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmpolyeeDaoImpl implements EmpolyeeDaoInterf{
Connection con;
    @Override
    public void createEmpolyee(Employee emp) {
        con= DBConnection.createDBConnection();
        String query="insert into emplOyee values(?,?,?,?,?)";
try{
    PreparedStatement pstm = con.prepareStatement(query);
    pstm.setInt(1,emp.getId());
    pstm.setString(2,emp.getName());
    pstm.setInt(3,emp.getSalary());
    pstm.setString(4,emp.getPerformance());
    pstm.setInt(5,emp.getAge());
    int cnt = pstm.executeUpdate();
    if(cnt !=0)
        System.out.println("Employee Inserted Successfully !!!");
}catch (Exception ex){
    ex.printStackTrace();
}
    }

    @Override
    public void showAllEmplyee() {
     con=DBConnection.createDBConnection();
     String query="select* from employee";
     System.out.println("Employee Details.....");
        System.out.println("-------------------------------------------------------------------");

        System.out.format("%s\t\t%s\t\t%s\t\t%s\t\t%s\n","ID","Name","Salary","Performance","Age");
        System.out.println("------------------------------------------------------------------");

        try{
         Statement stmt=con.createStatement();
         ResultSet result=stmt.executeQuery(query);
         while(result.next()){
             System.out.format("%d\t\t%s\t\t%d\t\t\t%s\t\t%d\t\t\t\n",
                     result.getInt(1),
                     result.getString(2),
                     result.getInt(3),
                     result.getString(4),
                     result.getInt(5));
             System.out.println("------------------------------------------------------------------");

         }

        }catch (Exception ex){
         ex.printStackTrace();
     }
    }

    @Override
    public void showAllEmpolyeeBasedOnId(int id) {
     con=DBConnection.createDBConnection();
     String query="select* from employee Where Id="+id;
        System.out.println("-------------------------------------------------------------------");

        System.out.format("%s\t\t%s\t\t%s\t\t%s\t\t%s\n","ID","Name","Salary","Performance","Age");
        System.out.println("------------------------------------------------------------------");

        try{
        Statement stmt=con.createStatement();
        ResultSet result=stmt.executeQuery(query);
         while(result.next()){
             System.out.format("%d\t\t%s\t\t%d\t\t\t%s\t\t%d\t\t\t\n",
                     result.getInt(1),
                     result.getString(2),
                     result.getInt(3),
                     result.getString(4),
                     result.getInt(5));
             System.out.println("------------------------------------------------------------------");


         }
     }catch (Exception ex){
      ex.printStackTrace();
     }
    }

    @Override
    public void updateEmpolyee(int id, String name) {
     con=DBConnection.createDBConnection();
     String query="update employee set name =? where id=?";
     try{
         PreparedStatement pstm=con.prepareStatement(query);
         pstm.setString(1,name);
         pstm.setInt(2,id);
         int cnt=pstm.executeUpdate();
         if(cnt !=0)
             System.out.println("Employee Details updated successfully !!");
     }catch(Exception ex){
         ex.printStackTrace();
     }



    }

    @Override
    public void deleteEmpolyee(int id) {
     con=DBConnection.createDBConnection();
     String query="delete from employee where id=?";
     try{
         PreparedStatement pstm=con.prepareStatement(query);
         pstm.setInt(1,id);
         int cnt=pstm.executeUpdate();
         if (cnt !=0)
             System.out.println("Employee Deleted Successfully !!! "+id);
     }catch (Exception ex){
         ex.printStackTrace();
     }
    }
}
