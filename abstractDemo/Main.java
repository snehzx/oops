package abstractDemo;

public class Main {
    public static void main(String[] args) {
        //Parent p = new Parent(40) ;-no obj of abstract class directly  but u can use it as ref var
        Daughter d = new Daughter(21);
        d.career();
        d.normal();
       System.out.println(d.VAL);
    }
}
