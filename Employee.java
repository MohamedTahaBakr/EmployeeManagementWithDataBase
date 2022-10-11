package com.mohamedprogramming.empapp;

public class Employee {
    private int id;
    private String name;
    private int salary;
    private String performance;
    private int age;

    public Employee(){

    }
    public Employee(int id, String name, int salary,String performance, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.performance = performance;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void  convertToPerformance(int Number){
        switch (Number){
            case 1:
                performance ="poor";
                break;
            case 2:
                performance ="ok";
                break;
            case 3:
                performance ="good";
               break;
            case 4:
                performance="Very_ good";
                break;
            case 5:
                performance="Excellent";
                break;
            default:
                System.out.println("You entered another number");
        }
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", performance"+ performance +
                ", age=" + age +
                '}';
    }
}
