package abstractDemo;
//abstract is needed when u know the methods are needed or surely is overridden
public abstract class Parent {
    int age;
    final int VAL;
    public Parent(int age ){
        this.age=age;
        VAL=3984732;
    }//no use since u cannot create obj of abstract class not even abstract constructors
    //abstract methods needs to be overriden and static cannot override so no abstract static methods
    static void hello(){
        System.out.println("hello");
    }
    void normal(){
        System.out.println("this is normal method");
    }
    abstract void career();
    abstract void favArtist();
}
