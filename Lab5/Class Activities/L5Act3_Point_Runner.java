package com.MalikSaqib;

public class L5Act3_Point_Runner
{
    public static void main(String[] args) {
            L5Act3_Point p1 = new L5Act3_Point(10,20);
            L5Act3_Point p2 = new L5Act3_Point (30,40);
            L5Act3_Point p3 = new L5Act3_Point ();
            L5Act3_Point p4 = p1.Add(p2,p3);
            p4.display();
    }
}
