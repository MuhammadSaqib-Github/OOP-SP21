package com.files.Lab12.withArrayList;
import java.util.ArrayList;

public class HumanResource {
    private ArrayList<Association> resources;

    public HumanResource(){
        resources = new ArrayList<>();
    }

    public void add(Association association){
        resources.add(association);
        association.associate();
    }


    public void delete(int id){
        for (int i = 0; i < resources.size(); i++) {
            if ( ((Person) resources.get(i)).getId()==id ){
                resources.remove(i);
                break;
            }
        }
    }

    public String toString()
    {
        String total="";
        for (int i = 0; i <resources.size(); i++) {
            total = total + resources.get(i).toString() + "\n";
        }

        return total;
    }
}