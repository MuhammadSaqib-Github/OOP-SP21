package com.files.Lab12.withArrayList;

public class RunnerWithArrayList {
    public static void main(String[] args) {
        HumanResource hr = new HumanResource();

        hr.add(new Teacher("MUKHTAR" , 12));
        hr.add(new Student("xyz" , 11));
        hr.add(new Teacher("abc" , 10));

        System.out.println(hr.toString());

        hr.delete(10);
        System.out.println("After deletee:- \n");
        System.out.println(hr.toString());
    }
}
