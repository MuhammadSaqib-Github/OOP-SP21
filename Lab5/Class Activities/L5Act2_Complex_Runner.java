package com.MalikSaqib;

public class L5Act2_Complex_Runner {
    public static void main(String[] args) {
        L5Act2_Complex c1 = new L5Act2_Complex(11,2);
        L5Act2_Complex c2 = new L5Act2_Complex(20,2);
        L5Act2_Complex c3 = new L5Act2_Complex();
        c3 = c1.Add(c2);
        c3.Show();
    }
}
