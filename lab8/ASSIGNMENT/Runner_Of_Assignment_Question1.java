package ASSIGNMENT;

public class Runner_Of_Assignment_Question1 {

    public static void main(String[] args) {

        Tape t = new Tape( "ueur" ,9000 ,90);
        Book b = new Book("ueur" ,9000 ,12);

        System.out.println(t.display() + b.display());
    }
}