
public class stat {
    public static void main(String[] args) {
        // student s = new student();
        // student t = new student();
        // student u = new student();
        // System.out.println(s.totalObject);

        // static can be access and modified without creating obj
        student.totalObject = 5;
        System.out.println(student.totalObject); //direct access


    }

}
