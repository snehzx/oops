package principles_oops.inheritance;
// diff constructors can also be polymorphism means acts of representing the same thing in multiple ways


class Box{
    private double a =1;
       double h;
    double w;
    double l;

    public double getA(){
        return a;
    }
    Box(){
         this.h =-1;
         this.w = -1;
         this.l = -1;
    }
    Box(double side){
        super(); // obj class
        this.h = side;
        this.w = side;
        this.l = side;
       // this(side , side , side); cannot write both super and this because this() is a constructor call 
       //obj are initialised top to bottom allowing it would cause double initilisation
    }
    Box(double h , double w , double l){
        this.h = h;
        this.w = w;
        this.l = l;
    }
    Box(Box old){
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }
     void info(){
        System.out.println("this box is printing");
    }
}

class BoxWeight extends Box{
    double weight;
     BoxWeight(){
        this.weight = -1;
    }
    BoxWeight(double h , double w , double l , double weight){
        super(h,w,l); // call the parent class constructor , used to initlise values present in the parent class
        //System.out.println(super.weight); can use this here but if name conflicts use super
        this.weight = weight;
    }
    BoxWeight(BoxWeight other){
        super (other); // same as line 61
        weight = other.weight;
    }
}

public class Main {
     public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println(box1.h+""+box1.w+""+box1.l);

        Box box2 = new Box(4);
        System.out.println(box2.h+""+box2.w+""+box2.l);

        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.h+""+box3.weight);
        //this took the value of the default super box

        Box box5 = new BoxWeight(2,3,4,5);
        System.out.println(box5.h);
        //here box5.weight cannot be accessed because it is of type box which does not contain weight
        //which means ref var determines what members can be accessed not the type of obj

        //BoxWeight box6 = new Box(2,3,4);
        // here though box6 is of type boxweight but the constructor box doesnt know about the boxweight weight
        // in simple terms a child can access parent but a parent cannot

        box5.getA();
    }
}
