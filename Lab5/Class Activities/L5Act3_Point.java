package com.MalikSaqib;

public class L5Act3_Point {
    private int X;
    private int Y;
    public L5Act3_Point()
    {
        X = 5;
        Y = 6;
    }
    public L5Act3_Point(int a, int c)
    {
        X = a;
        Y = c;
    }
    public void setX (int a)
    {
        X = a;
    }
    public void setY (int c)
    {
        Y= c;
    }
    public int getX()
    {
        return X;
    }
    public int getY(){
        return Y;
    }
    public L5Act3_Point Add(L5Act3_Point Pa, L5Act3_Point Pb )
    {
        L5Act3_Point p_new = new L5Act3_Point(X+ Pa.X + Pb.X, Y+ Pa.Y + Pb.Y);
        return p_new;
    }
    public void display()
    {
        System.out.println(X);
        System.out.println(Y);
    }
}
