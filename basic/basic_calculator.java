import java.util.Scanner;
public class basic_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("calculator : ");
        double a = sc.nextDouble();
        char op = sc.next().charAt(0);
        double b = sc.nextDouble();
        if (op == '+') System.out.println(a + b);
        else if (op == '-') System.out.println(a - b);
        else if (op == '*') System.out.println(a * b);
        else if (op == '/') System.out.println(a / b);
        else if (op == '%') System.out.println(a % b);
        else System.out.println("invalid operator");

        


        sc.close();
    }
}
