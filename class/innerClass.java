//outside class cannot be static because it exist only in class hierarchy and not outside but inside 
//a class it can be 
class Test2{
    static String name ;
    //consturctor can never be static 
    // constructor is a special fxn whose job is to create and initialise obj
    public Test2(String name){
        Test2.name = name;
    }
}
class Outer{
    static class Test3{
        String name2;
        public Test3(String name){
            this.name2 = name;
        }
    }
}
public class innerClass {
    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
        //here both name will be different
        Test a = new Test("xyz");
        Test b = new Test("pqr");
        System.out.println(a.name);
        System.out.println(b.name);

        //  Test2 c = new Test2("xyz");
        // Test2 d = new Test2("pqr");
        //here both will show the same name pqr
        
        System.out.println(Test2.name);
        System.out.println(Test2.name);

        Outer.Test3 t = new Outer.Test3("pyq");
        System.out.println(t.name2);

        
        //all these will throw error if the test class is not static because test is inside other class 
        //and if inner class is not static it depends on outside class so it needs and obj
    }
    // if the test class is outside the innerClass let it name as test2


}
// since static method dont need obj so they are resolved during compiled time
//if the Test class was outside another class then u need to call it like this Outer.Test t = new Outer.Test()
//output
/*xyz
pqr
null
null
pyq */

