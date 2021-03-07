
package lab2;

class Assignment2{
    int length;
    int breath;
    
    void getArea()
    {
        System.out.println("AREA IS: "+ 2 * ( length * breath  ) ); 
    }
    
    void perimeter()
    {
       System.out.println(" Perimeter : " + (2 * (length + breath) ));
    }
}
public class Assignment2Runner {
     public static void main(String[] args)
     {
         Assignment2 a = new Assignment2();
         a.breath = 12;
         a.length =12;
         a.getArea();
         a.perimeter();
     }    
}