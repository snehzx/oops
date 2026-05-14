package exceptionHandeling;

public class Main {
    public static void main(String[] args) {
        // int a =5;
        // int b=0;
        try{
            // divide(a,b);
            String name = "xyz";
            if(name.equals("xyz")){
                throw new myException("name is not xyz", new Throwable("hehe i know it i would hv to make a obj"));
            }
        }
        //catch(ArithmeticException e){
        //      System.out.println(e.getMessage());
        //      System.out.println(e.getCause());
        //      //the more strict rule should come above 
        // }
         catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        } 
        finally{
            System.out.println("this will always run");
        }
        
    }
    static int divide(int a ,int b) throws ArithmeticException{
            if(b==0){
                throw new ArithmeticException("please do not divide by zero");
                };
                return a/b;
            }
    }
/*
please do not divide by zero
this will always run */
