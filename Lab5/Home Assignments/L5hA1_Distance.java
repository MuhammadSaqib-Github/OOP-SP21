package com.MalikSaqib;

public class L5hA1_Distance {
 private int feet;
 private int inches;
    L5hA1_Distance()
    {
        feet=0;
        inches=0;
    }
    L5hA1_Distance(int f , int i)
    {
        feet = f;
        inches = i;
    }
    void setFeet(int f)
    {
        this.feet = f;
    }
    void setInches(int i)
    {
        this.inches = i;
    }
    int getFeet()
    {
        return feet;
    }
    int getInches()
    {
        return inches;
    }

    L5hA1_Distance Add(L5hA1_Distance add1 , L5hA1_Distance add2) 
    {
        L5hA1_Distance add = new L5hA1_Distance(add1.feet + add2.feet , add1.inches + add2.inches) ;
        return add;
    }

    void Display(L5hA1_Distance add )
    {
        System.out.println(add.feet + " and " + add.inches);
    }
}