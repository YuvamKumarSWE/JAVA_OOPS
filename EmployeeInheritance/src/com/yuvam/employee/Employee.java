package com.yuvam.employee;

public class Employee {
    private String name;
    private String eNumber;
    private String hireDate;

    public Employee(){
        this.name = "";
        this.eNumber ="";
        this.hireDate="";
    }

    public Employee(String name, String eNumber, String hireDate){
        this.name=name;
        this.eNumber=eNumber;
        this.hireDate=hireDate;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return eNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setENumber(String eNumber) {
        this.eNumber = eNumber;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
