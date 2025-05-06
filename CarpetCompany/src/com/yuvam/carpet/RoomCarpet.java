package com.yuvam.carpet;

public class RoomCarpet {

    public double rate;
    public RoomDimension roomDimension;

    public RoomCarpet(){
        this.rate = 0;
        this.roomDimension = new RoomDimension();
    }

    public RoomCarpet(double rate, RoomDimension roomDimension){
        this.rate = rate;
        this.roomDimension = roomDimension;
    }

    public double getTotalCost() {
        return roomDimension.getArea() * rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public RoomDimension getRoomDimension() {
        return roomDimension;
    }

    public void setRoomDimension(RoomDimension roomDimension) {
        this.roomDimension = roomDimension;
    }

    @Override
    public String toString() {
        return "RoomCarpet{" +
                "rate=" + rate +
                ", roomDimension=" + roomDimension +
                ", totalCost=" + getTotalCost() +
                '}';
    }
}


