package lab2;


class Assignment1{
    String name;
    String model;
    String number;
    
    void showData()
    {
        System.out.println("name: " + name + " Model: " + model + "numberr: " + number );
    }
}
public class Assignment1Runner {
   public static void main(String[] args)
   {
       Assignment1 a = new Assignment1();
       a.model = "2018";
       a.name  = "MEHRAN";
       a.number = "ACL-549";
       a.showData();
   }
}