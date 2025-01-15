import java.util.Scanner;
public class pallindrome {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = n; i != 0; i/=10){
            sum += i % 10;
            sum *= 10;
        }
        if(n == sum/10) System.out.println("pallindrome");
        else System.out.println("not a pallindrome");
    }
}
