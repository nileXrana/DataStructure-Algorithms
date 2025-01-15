import java.util.Scanner;
public class rohit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();
        float a = 1;
        float b = 2;
        float sum = 0;
        for(int i = 1; i <= n-1; i++){
            sum = sum + (a/b);
            a++;
            b++;
        }
        System.out.println(sum+1);


        sc.close();
    }
}
