/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author cui
 */
public class Lab3ActivityRunner 
{
    public static void main(String[] args)
    {
        Lab3Activity1 l = new Lab3Activity1();
        l.length=10;
        l.width = 5;
        System.out.println(l.Calculatearea());
    }
}