
package lab3;


public class L3hA2 {
    
    public int b;
    
    public L3hA2()
    {
        
    }
    
    public L3hA2(int B)
    {
        b=B;
    }

public void deposit(int B)
    {
        b = b+B ;
    }

public void withDraw(int B) 
{ 
    b=b-B ;
 }

public void Display()
{
    System.out.println("Net cash is: "  + b );
}

   
    
}
