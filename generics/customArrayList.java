package generics;

import java.util.Arrays;

public class customArrayList {
   private int[] data ;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;//also working as index value
    public customArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index , int value){
        data[index] = value;
        
    }
    private boolean isFull(){
        return size ==data.length;
    }
    private void resize(){
        int[] temp = new int[DEFAULT_SIZE *2];
        //copy the current items in the new array
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    @Override
    public String toString(){
        return "customArrayList{"+"data="+Arrays.toString(data)+", size="+size+"}";
    }
    public static void main(String[] args) {
        customArrayList list = new customArrayList();
        list.add(3);
        list.add(5);
        list.add(7);
        System.out.println(list);
        System.out.println(list.remove());
        list.add(4);
        System.out.println(list);

    }
}//here the prob is arraylist is of type int but trad arrlist has many types given in paramitarised type in generics 
/*
     
customArrayList{data=[3, 5, 7, 0, 0, 0, 0, 0, 0, 0], size=3}
7
customArrayList{data=[3, 5, 4, 0, 0, 0, 0, 0, 0, 0], size=3} */