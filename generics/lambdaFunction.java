package generics;
import java.util.ArrayList;
import java.util.function.Consumer;
public class lambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
    for(int i=0;i<5;i++){
        list.add(i+1);
    }
    // list.forEach((item)->System.out.println(item*2));
    //consumer is functional interfaces that takes something as input but returns nothing
    Consumer<Integer> fun = (item) -> System.out.println(item * 2);
    list.forEach(fun);

    Operation sum = (a,b)->a+b;
    Operation sub = (a,b)->a-b;
    Operation mul = (a,b)->a*b;
    lambdaFunction myCalci = new lambdaFunction();
    System.out.println(myCalci.operate(3, 4, mul));
    System.out.println(myCalci.operate(3, 4, sum));
    System.out.println(myCalci.operate(3, 4, sub));
    // can be replaces using method ref
    // Operation s = Integer::sum;
    // System.out.println(s.operation(10, 20));
     }
     private int operate(int a,int b , Operation op){
        return op.operation(a, b);
     }
}
interface Operation{
    int operation(int a,int b);
}
