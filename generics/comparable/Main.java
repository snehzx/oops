package generics.comparable;

import java.util.Arrays;
// import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(10, 87.24f);
        Student s2 = new Student(20, 88.78f);
        Student s3 = new Student(3, 83.78f);
        Student s4 = new Student(45, 48.78f);
        Student s5 = new Student(21, 98.78f);
        Student s6 = new Student(5, 74.78f);
        Student[] list ={s1,s2,s3,s4,s5,s6};
        System.out.println(Arrays.toString(list));
        // Arrays.sort(list , new Comparator<Student>(){
        //     @Override
        //     public int compare(Student o1 , Student o2){
        //         return Float.compare(o1.marks, o2.marks);
        //     }
        // });
        Arrays.sort(list ,(o1,o2)->-(int)(o1.marks-o2.marks));
        System.out.println(Arrays.toString(list));        
        if(s1.compareTo(s2)<0){
            System.out.println("s2 marks are more");
        }
    }
}
//[10, 20, 3, 45, 21, 5]
// [45, 5, 3, 10, 20, 21]
// s2 marks are more
