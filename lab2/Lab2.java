/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;



class Student{
    
    String name;
    int id;
    int age;
    char gender;
    String studentMajor;
    char section ;
    
    public void DisplayEntitiesData()
    {
     System.out.println("Name: " + name + " id: " + " age: " + age + " gender: " + gender +  " StudentMajor: " + studentMajor + " section: " + section );   
    }
    
}


public class Lab2 {
    public static void main(String[] args) {
        
        
     Student s1 = new Student();
     s1.name = "saqib"; 
     s1.age = 20;
     s1.id = 69 ;
     s1.gender = 'M' ;
     s1.section = 'B';
     s1.studentMajor = "Software eng.";
     s1.DisplayEntitiesData();
     
     Student s2 = new Student();
     s2.name = "Talha Rizwan"; 
     s2.age = 15;
     s2.id = 86 ;
     s2.gender = 'F' ;
     s2.section = 'B';
     s2.studentMajor = "Software eng.";
     s2.DisplayEntitiesData();   
        
    }
}
