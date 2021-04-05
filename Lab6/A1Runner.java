package com.MalikSaqib;

public class A1Runner {
    public static void main(String args[])
    {
        A1 ob1 = new A1 ();
        A1 ob2 = new A1 ();
        ob1.Var1=88;
        ob1.Var2="I'm Object1";
        ob2.Var2="I'm Object2";
        System.out.println("ob1 integer:"+ob1.Var1);
        System.out.println("ob1 String:"+ob1.Var2);
        System.out.println("ob2 integer:"+ob2.Var1);
        System.out.println("ob2 STring:"+ob2.Var2);
    }
}
