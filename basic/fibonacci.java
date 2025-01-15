import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(0+" ");
        System.out.print(1+" ");
        for(int i = 1; i <= n-2; i++){
            int sum = a + b;
            System.out.print(sum+" ");
            a = b;
            b = sum;
        }
        

    }
}
