package com.MalikSaqib;

public class hA2_Runner {

    public static void main(String[] args) {

        hA2 h1 = new hA2();
        hA2 h2 = new hA2();
        System.out.println("obj: "+ hA2.getObj());
        hA2.deleteObj(h2);
        System.out.println( "obj: " + hA2.getObj());

    }
}
