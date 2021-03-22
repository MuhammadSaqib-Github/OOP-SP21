package com.MalikSaqib;

public class AssignmentRunner {

        public static void main(String[] args) {

            Assignment a = new Assignment(2,3);
            a.display();
            if(a.equals(1.2)){
                System.out.println("Both fractions are equal");

            }
            else
                System.out.println("Both fractions are different");

            System.out.println("Fraction of two integers is :" + a.get());
        }


}
