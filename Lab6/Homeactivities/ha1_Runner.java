package com.MalikSaqib;
public class ha1_Runner {
    public static void main(String[] args) {
        ha1 savor1 = new ha1(2000);
        ha1 savor2 = new ha1(3000);

        ha1.setAnnualinterestRate(3);
        savor1.monthlyInterestrate();
        System.out.println("////" + savor1.getSavingBalance());
        savor2.monthlyInterestrate();
        System.out.println("////" + savor2.getSavingBalance());

        ha1.setAnnualinterestRate(4);
        savor1.monthlyInterestrate();
        System.out.println("////" + savor1.getSavingBalance());
        savor2.monthlyInterestrate();
        System.out.println("////" + savor2.getSavingBalance());
    }
}