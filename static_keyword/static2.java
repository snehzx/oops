public class static2 {
    public static void main(String[] args) {
        static2.fun();
        static2 funn = new static2();
        funn.fun2();
    }
    static void fun(){
        // greeting(); - cannot use this because it requires an instance but the function here does not
        //depends on instance
        //cannot access non static stuff inside static stuff without referencing there instances in a static context
        static2 obj = new static2();
        obj.greeting();
    }
    void fun2(){
        greeting();
    }
    void greeting(){
        System.out.println("hello world");
    }
    
}
// when i create an obj java internally creates this.greeting() for non-static methods 
// this represents an object so u cannot use this inside static methods
