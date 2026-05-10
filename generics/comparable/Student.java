package generics.comparable;

public class Student implements Comparable<Student> {
    int rollNo;
    float marks;
    public Student(int rollNo , float marks){
        this.rollNo = rollNo;
        this.marks = marks;
    }
    @Override
    public String toString(){
        return rollNo+"";

    }
    @Override
    public int compareTo(Student o){
        int diff = (int)(this.marks - o.marks);
        return diff;
    }
}
