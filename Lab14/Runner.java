package com.files.Lab14;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Account> account = new ArrayList<>();

        account.add(new Account(11, 91000));
        account.add(new Account(12, 28000));
        account.add(new Account(13, 30700));
        account.add(new Account(14, 46000));
        account.add(new Account(15, 55000));
        account.add(new Account(16, 60400));
        account.add(new Account(17, 7000));
        account.add(new Account(18, 48000));
        account.add(new Account(19, 90090));
        account.add(new Account(20, 19900));
        account.add(new Account(21, 55000));
        account.add(new Account(161, 60400));

        writeObjectToFile(account);


        ReadObjectFromFile(account);


        withDraw( account , 10000 , 15);

        ReadObjectFromFile(account);
//
//        try {
//            ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream("objFile"));
//            System.out.println("The Object has been read from the file");
//
//            for (int i = 0; i < account.size(); i++) {
//                Account obj = (Account) objectIn.readObject();
//                System.out.println("Account # " + (i + 1) + " details:- ");
//                System.out.println(obj.getAccountNumber() + "\n" + obj.getAmount());
//            }
//
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }


    }
//
    public static void withDraw( ArrayList<Account> a , int amount , int accN) {

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getAccountNumber()==accN)
            {
                a.get(i).setAmount(a.get(i).getAmount() - amount);
            }
        }

        writeObjectToFile(a);

    }

    public static void transFer( ArrayList<Account> a , int amount , int accN) {

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getAccountNumber()==accN)
            {
                a.get(i).setAmount(a.get(i).getAmount() + amount);
            }
        }

        writeObjectToFile(a);

    }

    public static void writeObjectToFile(ArrayList<Account> Obj) {


        try {
            ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream("objFile" ) );
            for (int i = 0; i < Obj.size(); i++) {
                objectOut.writeObject(Obj.get(i));
            }
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");

        } catch (EOFException ex) {
            System.out.println(ex);
        }
        catch (StreamCorruptedException streamCorruptedException)
        {

        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void ReadObjectFromFile(ArrayList<Account> account) {
        try {
            ObjectInputStream actRead = new ObjectInputStream(new FileInputStream("objFile"));

            for (int i = 0; i < account.size(); i++) {

                Account account1 = (Account) actRead.readObject();
                System.out.println("Account number" + account1.getAccountNumber());
                System.out.println("Account Amount" + account1.getAmount());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

