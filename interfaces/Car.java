package interfaces;

public class Car implements Engine , Brake , Media {
    int price;
    @Override
   public void start(){
        System.out.println("i start like a normal car");
    }
    @Override
    public void stop(){
        System.out.println("i stop like a normal car");
    }
    @Override
    public void acc(){
        System.out.println("i accelerate like a normal car");
    }
    @Override
   public void brake(){
        System.out.println("i brake like a normal car ");
    }
    // @Override
    // public void start(){

    // }
//here the prob is both engine and media has start and stop so it would be ambiguous to implement so use diff 
//implementations and then make a nicecar class and then implement it
}
