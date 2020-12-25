package com.company;

public class Circle {
    double radius;


    public void printCircleInfo(){
        System.out.println("radius = " + radius );
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getCircleArea(){
        return Math.PI * radius * 2;
    }
}
