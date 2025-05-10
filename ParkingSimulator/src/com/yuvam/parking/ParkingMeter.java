package com.yuvam.parking;

public class ParkingMeter {

    public int purchasedMinutes;

    public ParkingMeter(int purchasedMinutes){
        this.purchasedMinutes=purchasedMinutes;
    }

    public int getPurchasedMinutes() {
        return purchasedMinutes;
    }

    public void setPurchasedMinutes(int purchasedMinutes) {
        this.purchasedMinutes = purchasedMinutes;
    }
}
