package com.files.Lab12.AssignmentLab12.Task2;
import com.files.Lab12.AssignmentLab12.Task1.Shape;

public class Rectangle implements Shape{

    private double length;
    private double width;

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length*width;
    }
}
