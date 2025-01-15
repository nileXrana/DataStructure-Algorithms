import java.util.Scanner;
public class strong_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();
        int rem;
        int result = 0;
        for(int i = n; i != 0; i/=10){
            rem = i % 10;
            int sum = 1;
            for(int j = rem; j != 0; j--){
                sum = sum * j;
            }
            result = result + sum;
        }
        if(n == result) System.out.println("strong number");
        else System.out.println("not a strong number");









        sc.close();
    }

}