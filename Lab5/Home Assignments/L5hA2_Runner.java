package com.MalikSaqib;
public class L5hA2_Runner {
    public static void main(String[] args) {
        L5hA2_Book l1 = new L5hA2_Book("ali" , new String[] {"a" , "b" , "c"});
        L5hA2_Book l2 = new L5hA2_Book("ali." , new String[] {"a" , "b" , "c" , "d"});
        if (l1.compareBooks(l1,l2))
        {
            System.out.printf("Author name is same");
        }
        if (l1.compareChapters(l1 , l2))
        {
            l1.Display();
            System.out.println( " author book has more pages" );
        }
        else
        {
            l2.Display();
            System.out.printf("author book has more pages");

        }
    }
}