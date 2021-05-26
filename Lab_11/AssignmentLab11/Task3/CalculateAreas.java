package com.files.Lab12.AssignmentLab12.Task3;
import com.files.Lab12.AssignmentLab12.Task1.Shape;
import com.files.Lab12.AssignmentLab12.Task2.Circle;
import com.files.Lab12.AssignmentLab12.Task2.Rectangle;
import com.files.Lab12.AssignmentLab12.Task2.Triangle;


public class CalculateAreas {
    public static void main(String[] args) {
        Shape[] obj = new Shape[5];
        obj[0] = new Circle(5.0);
        obj[1] = new Triangle(2,3.0);
        obj[2] = new Circle(5.0);
        obj[3] = new Rectangle(2,5.0);
        obj[4] = new Triangle(9,5.0);

        double[] area =  function(obj);
        for (int i=0 ; i < 5 ; i++)
        {
            System.out.println("\n" + obj[i].getClass() + " has area :  " + area[i] );
        }

    }

    static double[] function(Shape[] obj){

        double[] area = new double[obj.length];

        for (int i =0 ; i<5 ; i++)
        {
            if ( (obj[i]) instanceof Circle)
            {
                area[i] = obj[i].area();
            }
            else if ((obj[i]) instanceof Rectangle)
            {
                area[i] =  obj[i].area();
            }
            else if ((obj[i]) instanceof Triangle)
            {
                area[i] =  obj[i].area();
            }
        }
        return area;
    }
}
