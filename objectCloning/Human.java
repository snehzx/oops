package objectCloning;

public class Human implements Cloneable{
    int age;
    String name;
    int arr[];
    public Human(String name , int age){
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,2,3,4,5};
    }
    // public Human(Human o){
    //     this .age = o.age;
    //     this.name = o.name;
    // }
   // @Override
    // public Object clone() throws CloneNotSupportedException{
    //     //this is shallow copy
    //     return super.clone();
    // }
    public Object clone() throws CloneNotSupportedException{
            //this is shallow copy
            Human twin = (Human)super.clone();

            //this is deep copy
            twin.arr = new int[twin.arr.length];
            for(int i =0;i<twin.arr.length;i++){
                twin.arr[i]=this.arr[i];
            }
            return twin;
        }
    
}//shallow copy- copy obj ref
//deep copy - copy totally
