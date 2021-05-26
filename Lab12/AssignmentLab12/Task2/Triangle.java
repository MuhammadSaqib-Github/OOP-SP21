package com.files.Lab12.AssignmentLab12.Task2;
import com.files.Lab12.AssignmentLab12.Task1.Shape;

public class Triangle implements Shape{

    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double area(){
        return (base*height)/2;
    }
}
