package com.files.Lab12.Activities;

public class HumanResource {
    private   Association HR[];
    private int index=-1;


    public void addHr(String name , int regNo , String o) {

        if (index==-1)
        {
            HR = new Association[1] ;
            index++;
        }
        else {
            extend();
            index++;
        }

        if (o.equals("Teacher")){
            HR[index] = new Teacher(name , regNo);
        }

        else if (o.equals("Student")) {
            HR[index] = new Student(name , regNo);
        }

        if (HR[index] instanceof Teacher) {
            ((Teacher) HR[index]).associate();
        }

        else if (HR[index] instanceof Student) {
            ((Student) HR[index]).associate();
        }
    }

    private void extend(){
        Association p[] = new Association[index+2];

        for (int i=0 ; i <= index; i++) {
            p[i] = HR[i];
        }
        HR = p;
    }


    void delete(int id){
        Association p[] = new Association[index];
        int x=0;
        boolean del ;
        for (int i=0 ; i<=index ; i++)
        {
            del = true;
                if ( ((Person)HR[i]).getId()==id){
                    del = false;
            }
            if (del)
             {
                p[x] = HR[i];
                x++;
            }
        }
        index--;
        HR = p;
    }

    public String toString()
    {
        String total="";
        for (int i = 0; i <= index; i++) {
                total = total + HR[i].toString() + "\n";
            }

        return total;
    }
}
