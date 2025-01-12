package SOLID.EXAMPLE1.ProblematicCode;

public class Employee{
    private int id; // Employee ID

    public int getId() {
        return id;
    }
    private String name; // Employee Name
    private String address; // Employee Address

    public String getAddress() {
        return address;
    }
    
    public Employee(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void printPerformanaceReport(){
        // Code to print performance report
        System.out.println("Printing performance report of employee: " + name);
    }
    public double computeSalary(){
        // Code to compute salary
        return 1000.0;
    }
    public void updateEmployeeDetails(){
        // Code to update employee details
        System.out.println("Updating employee details");
    }
    public void featchDeatils(){
        // Code to fetch employee details
        System.out.println("Fetching employee details");
    }


    
}