import java.util.Scanner;
public class star_diamond_pp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n - 1; 
        int b = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= a; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= b; j++){
                System.out.print("* ");
            }
            System.out.println();
            a--;
            b+=2;
        }

        n--;
        a = 1;
        b-=4;
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= a; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= b;j++){
                System.out.print("* ");
            }
            System.out.println();
            a++;
            b-=2;
        }
















        sc.close();
    }
}
