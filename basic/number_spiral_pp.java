import java.util.Scanner;
public class number_spiral_pp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : " );
        int n = sc.nextInt();
        for(int i = 1; i <= 2 * n - 1; i++){
            for(int j = 1; j <= 2 * n - 1; j++){
                int a = i, b = j;
                if(i > n) a = 2 * n - i;   //psudo numbers
                if(j > n) b = 2 * n - j;   //psudo numbers
                System.out.print(n + 1 - Math.min(a ,b)+" ");
            }
            System.out.println();
        }








        sc.close();
    }
}
