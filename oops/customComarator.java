import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int rno;
    double marks;
    Student(String name, int rno, double marks){
        this.name = name;
        this.rno = rno;
        this.marks = marks;
    }
    public int compareTo(Student s){
        return Double.compare(this.marks , s.marks);
    }
}
public class customComarator {
    public static void main(String[] args) {
        Student s1 = new Student("nilesh",60,75.5);
        Student s2 = new Student("arvind",55,89.5);
        Student s3 = new Student("rohit",45,99.5);
        Student s4 = new Student("aditya",1,80.5);
        Student[] arr = new Student[4];
        arr[0] = s1; arr[1] = s2; arr[2] = s3; arr[3] = s4;

        Arrays.sort(arr); // important(?) -> kis basis pe sort karu bhai? -> Custom Comparator

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i].name+" "+arr[i].rno+" "+arr[i].marks);
        }
    }
}
