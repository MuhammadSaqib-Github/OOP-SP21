package com.MalikSaqib;

public class hA2 {
    private static int obj=0;
     hA2()
    {
        obj++;
    }

    public static int getObj() {
        return obj;
    }

    public static void deleteObj(hA2 o)
    {
        o=null;
        obj--;
    }

}
