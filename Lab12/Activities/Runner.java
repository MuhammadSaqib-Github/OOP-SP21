package com.files.Lab12.Activities;

public class Runner {

    public static void main(String[] args) {
        HumanResource humanResource = new HumanResource();
        humanResource.addHr("saqib", 98 , "Teacher");
        humanResource.addHr("again Saqib" , 99 ,"Teacher");
        humanResource.addHr("Once again Saqib" , 100 ,"Teacher");
        humanResource.addHr("Always saqib" , 101,"Student");
        humanResource.addHr("ever ever saqib" , 102,"Teacher");
        System.out.println(humanResource);

        humanResource.delete(99);
        humanResource.delete(102);

        System.out.println(humanResource);

        //humanResource.delete(101);

        //System.out.println("after delete: ");
       // System.out.println(humanResource);


       // System.out.println(humanResource);

    }
}