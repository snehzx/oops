package extendExample;

public interface A {
    static void greeting(){
        System.out.println("this is greet");
    };//static methods are not overriden or inherited so we have to have body of static interface methods here only
    void greet();
    default void hello(){
        System.out.println("hello"); //default adds no need to write in main
    };
}
