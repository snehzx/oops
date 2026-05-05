package principles_oops.polymorphism;


public class poly {
    public static void main(String[] args) {
        shapes shape = new shapes();
        shapes squares = new square();
        shape.area();
        squares.area();
       
        System.out.println(squares instanceof shapes);

    }
}

class shapes{
   
    
    // here if i use final keyword it would not be able to override
    void area(){
        System.out.println("i am in shapes");
    }
}
class square extends shapes{

    //this will run when obj of square is created
    // it is overriding the parent method
    @Override // this is annotation used for check purposes
    void area(){
        System.out.println("area is soemthing");
    }
}

//feilds are decided by ref types during compile time like in box box5 = new boxweight
//but here methods are decided by obj types and resolved during runtime

//if we remove area from shapes it will not work because the type is shapes and it should exists in shapes otherwise overriding iwll not happen
