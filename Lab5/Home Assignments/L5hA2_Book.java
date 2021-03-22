package com.MalikSaqib;

public class L5hA2_Book {
    private String Author;
    private String[] chapterNames = new String[100];
    L5hA2_Book()
    {
        String Author="";
        String[] chapterNames = new String[]{};
    }
    L5hA2_Book(String a, String[] s)
    {
        this.Author = a;
        this.chapterNames = s;
    }

    Boolean compareBooks(L5hA2_Book a, L5hA2_Book b)
    {
        if (a.Author.equals(b.Author))
        {
            return true;
        }
        else
            return false;
    }

    Boolean compareChapters(L5hA2_Book a, L5hA2_Book b)
    {
        if (a.chapterNames.length>b.chapterNames.length)
        {
            return true;
        }
        else
            return false;
    }
    void Display()
    {
        System.out.printf(Author);
    }

}