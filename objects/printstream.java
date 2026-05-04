 class test{
   public static printstream out;
}

class printstream{
    void greeting(){
        System.out.println("hello world");
    }
    public static void main(String[] args) {
        test.out = new printstream();
        test.out.greeting();
    }
}
// here this is a demo for how sout works.. 
/*
    so there are lets say two classes System and PrintStream which are in diff packages of java
    now this System class has a static instance variable called out of type printStream
    and in printStream there is a method called println
    so now when an obj is made using out as ref var and the method println is called on System.out which is 
    an obj and obj has to be static to call it using class name 
*/
