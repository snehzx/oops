

public class current_obj {
    public static void main(String[] args) {
   
   class Student {
    String name = "sneha";

    void register(Student s) {
        System.out.println(s.name);
    }

    void callRegister() {
        register(this); 
    }
}
Student s1 = new Student();
s1.callRegister();

    }
}
//this gets the obj s1 and when register is called then s1.name=sneha
