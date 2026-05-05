package principles_oops.polymorphism;

class Animal{
    private int age;
    Animal(int age){
        this.age = age;
    }
    public int getA(){
        return age;
    }
void show(){
    System.out.println(age);
}
}
class rabit extends Animal{
    rabit(int age){
        super(age);
    }
    void print(){
show();
    }
}

public class privatee {
    public static void main(String[] args) {
        rabit rab = new rabit(10);
        rab.print();
        Animal a = new Animal(0);
        System.out.println(a.getA());
    }
}
//getter-read only data
//setter- can change the data
