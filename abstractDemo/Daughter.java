package abstractDemo;

public class Daughter extends Parent{
    
    public Daughter(int age){
        super(age);//since parent class has its own construtor the default constructor parent() gets removed and now this one tries to call
        //super() which throws error so we have to do super(age)
    }
    @Override
    void normal(){
        super.normal();
    }
    @Override
     void career(){
        System.out.println("i wanna become a dev");
    }
    @Override
    void favArtist(){
        System.out.println("i love doja cat");
    }

}
