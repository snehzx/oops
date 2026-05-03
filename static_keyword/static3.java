package static_keyword;
public class static3 {
    
    class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        static3 outer = new static3();
         static3.Test a  = outer.new Test("Kunal");

        static3.Test b = outer.new Test("Rahul");

        System.out.println(a.name); // Kunal
        System.out.println(b.name); // Rahul
    }
}
//if u use class inside class which is not static it becomes heavy and ugly to call it inside main
