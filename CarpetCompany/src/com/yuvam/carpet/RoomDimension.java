package com.yuvam.carpet;

public class RoomDimension {
    public double length;
    public double width;

    public RoomDimension(){
        this.length = 0;
        this.width = 0;
    }

    public RoomDimension(double length, double width){
        this.length=length;
        this.width=width;
    }

    public double getArea(){
        return this.length * this.width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "RoomDimension{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
