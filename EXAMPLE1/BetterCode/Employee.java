package SOLID.EXAMPLE1.BetterCode;

public class Employee {
    private int id; // Employee ID
    private String name; // Employee Name
    private String address; // Employee Address

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public String getEmployeeName(){
        // Code to fetch employee details
        return name;
    }
    public int getEmployeeId(){
        // Code to fetch employee details
        return id;
    }
    public String getEmployeeAddress(){
        // Code to fetch employee details
        return address;
    }  
    public void setEmployeeName(String name){
        // Code to update employee details
        this.name = name;
    }

    
}
