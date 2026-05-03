package static_keyword;
public class staticBlock {
    static int a = 3;
    static int b;
    // will run only once  when the class is loaded for the first time
    static{ // when the class staticBlock is loaded by the jvm
        System.out.println("i am in static block");
        b = a*3;
    }
    public static void main(String[] args) {
        // staticBlock obj = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b);

        staticBlock.b += 3;
        System.out.println(staticBlock.a +" " + staticBlock.b);

        // staticBlock obj2 = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b);
    }
}
//output
// i am in static block
// 3 9
// 3 12
// 3 12