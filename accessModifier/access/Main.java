package accessModifier.access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10,"hello");
        obj.setNum(2);
        int n = obj.getNum();
        System.out.println(n);
        System.out.println(obj.getClass());// method in object class
        System.out.println(obj.getClass().getName());
        System.out.println(obj instanceof A);
    }
}
/*
2
class access.A
access.A
true */