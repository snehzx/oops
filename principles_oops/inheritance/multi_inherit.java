package principles_oops.inheritance;
public class multi_inherit {
public static void main(String[] args) {
    
}
    
}

class Box{
    double n;
    Box(){
        this.n = 2;
    }
}
class Box2{
    double n ;
    Box2(){
        this.n = 4;
    }
}
class Box3 extends Box{
    double p ;
    Box3(){
        super();
        this. p = 5;
    }
}
// class Box3 extends Box2{
//     double q ;
//     Box3(){
//         super();
//         this. p = 5;
//     }
// }

// because of this issue multiple inheritance is not allowed because it creates ambiguity that which double n to call
// still if needed interface is used