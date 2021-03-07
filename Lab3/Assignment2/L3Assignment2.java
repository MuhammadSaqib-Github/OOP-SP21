/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author cui
 */
public class L3Assignment2 {
    
    int hour;
    int minutes;
    int seconds;
    String status;

      
   public void Display()
    {
        if(hour < 24 && hour > 0 && minutes >0 && minutes<24 && seconds>0 && seconds < 24){
        System.out.println(hour+":"+minutes+":"+seconds + " " + status);}
        else
        {
                    System.out.println(" INVALID ENTRY. ");}

}
}

