package com.files.Lab12.Activities;

import java.util.Scanner;

public class Person  {
    private String name;
    private int id ;


    public Person(String s, int i) {
        this.id = i ; this.name = s;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}



