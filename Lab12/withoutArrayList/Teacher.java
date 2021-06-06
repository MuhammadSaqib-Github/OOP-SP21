package com.files.Lab12.Activities;

import java.util.Scanner;

public class Teacher extends Person implements Association{
    private String Designation;
    private String Department;


    Teacher(String s, int i){// , String d , String department) {
        super(s, i);
       /* this.Designation=d;
        this.Department = department;*/
    }

    public String getDesignation() {
        return Designation;
    }

    @Override
    public void associate()  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Departmet: ");
        this.Department = scanner.next();
        System.out.println("Enter Designation");
        this.Designation = scanner.next();
    }


    public String toString() {
        return "person: " + super.toString() + "Teacher{" +
                "Designation='" + Designation + '\'' +
                ", Department='" + Department + '\'' +
                '}';
    }
}
