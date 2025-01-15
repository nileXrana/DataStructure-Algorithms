import java.util.*;
public class plusOperator {
    public static void main(String[] args) {
        String str = "Nilesh";
        String std = "Rana";
        String a = str + std;
        System.out.println(a);
        String b = 10 + a;
        System.out.println(b);
        System.out.println();

        //herarchy / precedence
        System.out.println("nilesh"+10+20);
        System.out.println(10+20+"nilesh");
    }
}
