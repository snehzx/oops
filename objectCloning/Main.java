package objectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human h = new Human("xyz" , 22);
        // Human twin = new Human(h);
        // System.out.println(twin.age);

        Human twin = (Human)h.clone();
        System.out.println(twin.age);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0]=200;
        System.out.println(Arrays.toString(h.arr));
    }
}
/*
22
[1, 2, 3, 4, 5]
[200, 2, 3, 4, 5] */
/*
in deep copy output-22
[1, 2, 3, 4, 5]
[1, 2, 3, 4, 5] */