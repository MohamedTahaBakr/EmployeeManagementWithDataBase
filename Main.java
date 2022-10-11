package com.mohamedprogramming.empapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int id;
        EmpolyeeDaoInterf dao = new EmpolyeeDaoImpl();
        System.out.println("Welcome to Empolyee management application");
        Scanner sc = new Scanner(System.in);
         do{
             System.out.println( "1. Add Empolyee\n"+
                 "2.Show All empolyee\n"+
                     "3.Show Employee based on id \n"+
                     "4.update the employee \n "+
                     "5.delete the empolyee\n");
             System.out.println("Please enter choice");
             int ch=sc.nextInt();
             switch (ch){
                 case 1:
                     Employee emp= new Employee();
                     System.out.println("Enter Id:");
                    id =sc.nextInt();
                     System.out.println("Enter name ");
                      name=sc.next();
                     System.out.println("Enterr salary");
                     int salary=sc.nextInt();
                     System.out.println("Enter performance");
                     int number= sc.nextInt();
                     emp.convertToPerformance(number);
                     System.out.println("Enter age ");
                     int age =sc.nextInt();
                     emp.setId(id);
                     emp.setName(name);
                     emp.setSalary(salary);
                     emp.setPerformance(emp.getPerformance());
                     emp.setAge(age);
                     dao.createEmpolyee(emp);
                     //dao.createEmployee(emp);
                     break;
                 case 2:
                     dao.showAllEmplyee();
                     break;
                 case 3:
                     System.out.println("Please enter the id to show All details ");
                     int empId =sc.nextInt();
                     dao.showAllEmpolyeeBasedOnId(empId);
                     break;
                 case 4:
                     System.out.println("Enter the Id to Update the details ");
                     int empid1=sc.nextInt();
                     System.out.println("Enter the new name ");
                     name =sc.next();
                     dao.updateEmpolyee(empid1,name);
                     break;
                 case 5:
                     System.out.println("Enter the id to delete");
                     id=sc.nextInt();
                     dao.deleteEmpolyee(id);
                     break;
                 case 6:
                     System.out.println("Thank you for using our Application !!");
                     System.exit(0);
                     default:
                     System.out.println("Enter Valid choice !");
                     break;

             }
         }while(true);
    }
}
