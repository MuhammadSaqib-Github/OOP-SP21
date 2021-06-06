package com.files.Lab12.withArrayList;


import java.util.Scanner;

public class Teacher extends Person implements Association {
    private String Designation;
    private String Department;


    Teacher(String s , int i){
        super(s,i);
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

