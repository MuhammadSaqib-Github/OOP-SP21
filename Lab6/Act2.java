package com.MalikSaqib;

public class Act2 {

    private static int objs=0;
    //private int a;

    Act2(){
        objs++;
    }

    /*public Act2(int x){
        a=x;
        objs++;
    }*/
    public static int getObjs (){
        return objs;
    }

}
