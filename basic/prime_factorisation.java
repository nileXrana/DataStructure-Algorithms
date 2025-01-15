import java.util.Scanner;
public class prime_factorisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                int factor = i;
                int a = 0;
                for(int j = 2; j <= factor - 1; j++ ){
                    if(factor % j == 0){
                        a = 1;
                        break;
                    }
                }
                if(a == 0) System.out.println(factor);
            }
        }









        sc.close();
    }
}
