public class classes{
    public static void main(String args[]){
        class Student{
            int roll;
            int marks;
            String name;
            Student(int roll , int marks , String name){
                // roll = rll;
                // marks = mark;
                // name = naam;
                this.roll = roll;
                this.marks = marks;
                this.name = name;
            }
            // Student(Student other){
            //     this.roll = other.roll;
            //     this.marks = other.marks;
            //     this.name = other.name;
            // }
            //this gives the reference to the current object
            //this is always a reference to the object on which the method was invoked
            //constructor inside constructor
            Student(){
                this(20,78,"abc");
            }
        }
        //  Student xyz = new Student(103,83,"xyz");
        // Student random2 = new Student(xyz);
       
        // Student  = new Student(10,92,"pqr");
        Student random = new Student();
        random.roll = 103;
        random.marks = 83;
        random.name = "heyy name";
        System.out.println(random.roll);
        System.out.println(random.marks);
        System.out.println(random.name);
    }
}
//output-103
// 83
// heyy name