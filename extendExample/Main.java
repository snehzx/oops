package extendExample;

public class Main implements B {
    @Override
    public void fun(){
        System.out.println("have fun");
    };
    @Override
    public void greet(){
        System.out.println("hello");
    };
    public static void main(String[] args) {
        // Main obj = new Main();
        A.greeting();
    }
}
//extends is used from interface to interface inherit and implemets from interface to class
//annotations also internally implements interface