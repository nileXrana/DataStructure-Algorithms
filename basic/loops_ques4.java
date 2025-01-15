import java.util.Scanner;
public class loops_ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = n; i != 0; i/=10){
            sum  = (sum * 10) + (i % 10);
        }
        
        if(n == sum) System.out.println("palindrome");
        else System.out.println("not a palindrome");






        sc.close();
    }
}
