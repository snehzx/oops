package accessModifier.access2;
import accessModifier.access.A;

public class B {
    public static void main(String[] args) {
        A obj = new A(20,"hel");
        int n = obj.getNum();
        System.out.println(n);
        // if the variable num was protected we could access it here in the subclass but not in the main class
        // but since it is private it cannot be accessed directly anywhere
        subClass obj2 = new subClass(30, null);
        System.out.println(obj2 instanceof A);//true
            System.out.println(obj2.getNum());
            A obj3 = new subClass(40, null);
            System.out.println(obj3.getNum());
        }
}
 class subClass extends A{
    public subClass(int num , String name){
        super(num,name);
        super.num = num;
        //super.name=name;- this wont work because name is not protected 
    }
    public int getNum(){
        return num;
    }
    
}
/*
20
true
30
40 */