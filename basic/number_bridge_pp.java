import java.util.Scanner;
public class number_bridge_pp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        for(int i = 1; i <= 2 * n - 1; i++) System.out.print(a+++" ");
        System.out.println();
        n--;
        for(int i = 1; i <= n; i++){
            a = 1;
            for(int j = 1; j <= n + 1 - i; j++){
                System.out.print(a+++" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.print("  ");
                a++;
            }
            for(int j = 1; j <= n + 1 - i ; j++){
                System.out.print(a+++" ");
            }

            System.out.println();
        }







        sc.close();
    }

}
