
public class objectPrint {
    int num;
    objectPrint(int num){
        this.num = num;
    }
    @Override
    public String toString(){
        return "objectPrint{" +
        "num=" + num +
        '}';
    }
    public static void main(String[] args) {
        objectPrint obj = new objectPrint(54);
        System.out.println(obj);

    }
}
// this is overriding the object class toString method to print the obj at runtime
// static methods can also be not overriden even though it can be inheritted
// because overriding depends on objects but static methods do not depends on obj
