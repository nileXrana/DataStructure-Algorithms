import java.util.Scanner;
public class loops_ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int a = sc.nextInt();
        System.out.print("enter second number : ");
        int b = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= a || i <= b; i++){
            if(a % i == 0 && b % i == 0){
                sum = i;
            }
        }
        System.out.println("GCD of numbers is : "+sum);





        sc.close();
    }
}
