package com.files.Lab12.AssignmentLab12.Task2;
import com.files.Lab12.AssignmentLab12.Task1.Shape;

public class Circle implements Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double area(){
        return 3.14*radius;
    }
}
