package com.files.Lab12.withArrayList;


import java.util.Scanner;

public class Student extends Person implements Association {
    private int regNo ;
    private int semester;

    Student(String s, int i ){
        super(s, i);
    }


    public int getRegNo() {
        return regNo;
    }

    public int getSemester() {
        return semester;
    }

    @Override
    public String toString() {
        return "person: " + super.toString() + "Student{" +
                "regNo=" + regNo +
                ", semester=" + semester +
                '}';
    }

    @Override
    public void associate()  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Reg#: ");
        this.regNo = scanner.nextInt();
        System.out.println("Enter semester");
        this.semester = scanner.nextInt();

    }
}

