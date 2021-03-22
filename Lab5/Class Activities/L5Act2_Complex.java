package com.MalikSaqib;

public class L5Act2_Complex {
    private double real;
    private double imag;
    public L5Act2_Complex()
    { real = 0.0; imag = 0.0; }
    public L5Act2_Complex (double r, double im)
    { real = r; imag = im; }
    public L5Act2_Complex Add (L5Act2_Complex b)
    {
        L5Act2_Complex c_new = new L5Act2_Complex (real + b.real, imag+ b.imag);
        return c_new;
    }
    public void Show ()
    {
        System.out.println( real + imag);
    }
}
