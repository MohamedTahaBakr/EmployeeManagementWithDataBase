package com.mohamedprogramming.empapp;

public interface EmpolyeeDaoInterf {
 // create empolyee
    public void createEmpolyee(Employee emp);
    //show all empolyee
    public void showAllEmplyee();
    // show empolyee base on id
    public void showAllEmpolyeeBasedOnId(int id);
    // update empolyee
    public void updateEmpolyee(int id,String name);
    //delete empolyee
    public void deleteEmpolyee(int id);

}
