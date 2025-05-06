package com.yuvam.area;
import java.math.*;
public class Area {
    public static void area(int radius){
        System.out.println(Math.PI * radius);
    }
    public static void area(int length, int width){
        System.out.println(length * width);
    }

    public static void area(int radius, double height){
        System.out.println(Math.PI * radius * radius * height);
    }



}
