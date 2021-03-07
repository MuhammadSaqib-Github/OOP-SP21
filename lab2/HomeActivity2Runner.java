package lab2;

class HomeActivity{
    int hour;
    int minutes;
    int seconds;
    String status;
    
    void Display()
    {
        System.out.println(hour+":"+minutes+":"+seconds + " " + status);
    }
}


public class HomeActivity2Runner {
    public static void main(String[] args)
    {
        HomeActivity h = new HomeActivity();
        h.hour = 3;
        h.minutes = 23;
        h.seconds = 30;
        h.status = "AM"
        h.Display();
    }
}