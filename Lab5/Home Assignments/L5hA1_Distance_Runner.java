package com.MalikSaqib;

public class L5hA1_Distance_Runner {
    public static void main(String[] args) {
        L5hA1_Distance l1 = new L5hA1_Distance(1,2);
        L5hA1_Distance l2 = new L5hA1_Distance(3,4);
        L5hA1_Distance l ; //=  new L5hA1_Distance(5,6);
        l = l1.Add(l1,l2);
        l.Display(l);
    }
}