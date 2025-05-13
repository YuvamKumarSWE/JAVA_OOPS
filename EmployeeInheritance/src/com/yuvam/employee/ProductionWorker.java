package com.yuvam.employee;

public class ProductionWorker extends Employee {
    private int shift;
    private double payRate;

    public ProductionWorker(String name, String eNumber, String hireDate, int shift , double payRate){
        super(name,eNumber,hireDate);
        this.shift = shift;
        this.payRate = payRate;
    }

    public ProductionWorker( int shift , double payRate){
        super();
        this.shift = shift;
        this.payRate = payRate;
    }

    public ProductionWorker(){
        super();
        this.shift = 0;
        this.payRate = 0.0;
    }

    public double getPayRate() {
        return payRate;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public String toString() {
        return  "ProductionWorker{" +
                "shift=" + shift +
                ", payRate=" + payRate +
                '}';
    }
}
