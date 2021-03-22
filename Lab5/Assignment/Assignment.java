package com.MalikSaqib;

public class Assignment {
   private double i1;
   private double i2;


    Assignment(){
        i1 = 1;
        i2 = 1;

    }

    Assignment(int integer1, int integer2){

        this.i1 = integer1;
        this.i2 = integer2;

    }

    public void set(int integer1, int integer2){
        this.i1 = integer1;
        this.i2 = integer2;
    }
    public double get(){
        return (double) i1/(double) i2;
    }
    public boolean equals(double val){
        double frac;
        frac = i1/i2;
        return frac == val;


    }
    public void display(){
        double fraction;

        fraction = (double) i1/(double) i2;
        System.out.println("Ratio: "+ fraction);
    }
}

