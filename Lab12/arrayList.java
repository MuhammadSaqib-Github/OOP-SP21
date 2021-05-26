package com.files.Lab12;

public class arrayList<type> {

        private type[] list ;


    public void add(Object o){
            if(list==null) {list =(type[]) new Object[1];  list[0]= (type) o;}
            else{
                type temp[] = (type[]) new Object[list.length];
                for(int i=0;i< list.length;i++) temp[i]=list[i];
                temp[list.length]= (type) o;
                list=temp;
            }
        }
        public void deleteAtIndex(int i){
            if(list!=null && i>=0 && i< list.length){
                Object[] temp = new Object[list.length-1];
                for(int x=0,j=0;x< list.length;x++){
                    if(i==x) continue;
                    temp[j]=list[x];
                    j++;
                }
                list = (type[]) temp;
            } else System.out.println("either list is empty of index is invalid");
        }
        public void deleteByValue(Object i){
            if(list!=null && i!=null){
                Object[] temp = new Object[list.length-1];
                for(int x=0,j=0;x< list.length;x++){
                    if(i.equals(list[x])) continue;
                    temp[j]=list[x];
                    j++;
                }
                list = (type[]) temp;
            } else System.out.println("either list is empty of index is invalid");
        }
        public void print(){
            for(int i=0;i< list.length;i++) {
                System.out.print(list[i] ); if(i!=list.length-1) System.out.print(",");
            }

            System.out.println();
        }
}
