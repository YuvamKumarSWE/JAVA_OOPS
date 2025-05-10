package com.yuvam.parking;

public class ParkedCar {
    public String make;
    public String model;
    public String color;
    public String licenseNumber;
    public int minutesParked;

    public ParkedCar(String make, String model, String color, String licenseNumber, int minutesParked){
        this.make=make;
        this.model=model;
        this.color=color;
        this.licenseNumber=licenseNumber;
        this.minutesParked=minutesParked;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getMinutesParked() {
        return minutesParked;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void setMinutesParked(int minutesParked) {
        this.minutesParked = minutesParked;
    }
}
