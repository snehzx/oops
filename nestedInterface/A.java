package nestedInterface;

public class A {
    public interface InnerA {
    
        boolean isOdd(int num);
    }
}
class B implements A.InnerA{
    @Override
    public boolean isOdd(int num){
        return (num & 1)==1;
    }
}
// nested interface can be public protected or default but the top interface can only be public or default