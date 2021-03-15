package com.MalikSaqib;

public class SP20_BSE_069_LAB4_ASSIGNMENT_HOTDOG {
    private int id_num ;
    private int sold_hotdogs;
    SP20_BSE_069_LAB4_ASSIGNMENT_HOTDOG(int a , int b)
    {
        id_num = a;
        sold_hotdogs = b;
    }

    void justSold(int sold)
    {
     sold_hotdogs= sold_hotdogs + sold;
    }
    void display()
    {
        System.out.println("Sold:- " + sold_hotdogs);
    }
}