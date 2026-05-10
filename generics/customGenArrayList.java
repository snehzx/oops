package generics;
import java.util.Arrays;
// while writing generic type info , after compilation it removes it so T becomes Object 
//means while creating the bytecode it removes generic type , becuase it was only meant for typechecking during compilation and not for bytecode
//if something needs an actual obj to determine it works at runtime else compile time
//wildcard - ?-anything 
//? extends T - t or subclass
// ? super T - t or upperclass
// we can also have generic interfaces
import java.util.List;

public class customGenArrayList<T extends Number> {
    private T[] data ;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;//also working as index value
    @SuppressWarnings("unchecked")
    public customGenArrayList(){
        this.data = (T[]) new Object[DEFAULT_SIZE];
    }
    public void getList(List<? extends Number> list){
        // this is wildcard ex - anything double float int
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    public T remove(){
        T removed = data[--size];
        return removed;
    }
    public T get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index , T value){
        data[index] = value;
        
    }
    private boolean isFull(){
        return size ==data.length;
    }
    private void resize(){
        @SuppressWarnings("unchecked")
        T[] temp = (T[]) new Object[data.length * 2];
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
        customGenArrayList<Integer> list = new customGenArrayList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        System.out.println(list);
        System.out.println(list.remove());
        list.add(4);
        System.out.println(list);
    }
}
