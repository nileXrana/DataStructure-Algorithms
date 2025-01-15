import java.util.Scanner;
public class swap2nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int a = sc.nextInt();
        System.out.print("enter second number : ");
        int b = sc.nextInt();
        
        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println("first number is "+a);
        // System.out.println("second number is "+b);


        //swap without using extra variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("first number is "+a);
        System.out.println("second number is "+b);





        sc.close();
    }
}
