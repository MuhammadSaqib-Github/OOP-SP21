package com.MalikSaqib;

public class L5Act1_PassingObj_Runner
{
    public static void main(String[] args)
    {
        L5Act1_PassingObj p = new L5Act1_PassingObj();
        p.value = 5;
        System.out.println("Before calling: " + p.value);
        p.increment(p);
        System.out.println("After calling: " + p.value);
    }
}
