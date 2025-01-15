public class basic{

    public static void change(student x){
        x.name = "akhil";
    }
    public static void main(String[] args) {
        student x = new student();  // declaration (x is object of stud class)
        x.name = "nilesh";
        x.percent = 70.25;
        System.out.println(x.name);
        change(x);
        System.out.println(x.name);  // classes are passed by reference

        System.out.println(x.getrno());
        // now we can access rno even it is private(getter)

        x.setrno(60);
        System.out.println(x.getrno());
        // now we can update rno even it is private(setter)

        // power of final
        //x.schoolName = "DBPS";
        System.out.println(x.schoolName);

    }
}