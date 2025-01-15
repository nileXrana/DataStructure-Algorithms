import java.util.Scanner;

public class diamondPP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();
        int a = n;
        int b = -1;
        int c = 1;
        int e = n - 2;
        int f = n - 2;

    
        for(int i = 1; i <= 2 * n + 1; i++){
            if(i <= n){
                for(int j = 1; j <= a; j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
                for(int k = 1; k <= b; k++){
                    System.out.print("  ");
                }
                if(i > 1) System.out.print("* ");
                for(int l = 1; l <= b; l++){
                    System.out.print("  ");
                }
                if(i != 1) System.out.print("* ");
                a--;
                b++;
            }
            else if(i == n + 1){
                for(int m = 1; m <= 2 * n + 1; m++){
                    System.out.print("* ");
                }
            }
            else{
                for(int o = 1; o <= c; o++){
                    System.out.print("  ");
                }
                System.out.print("* ");
                for(int p = 1; p <= e; p++){
                    System.out.print("  ");
                }
                if(i != 2 * n + 1) System.out.print("* ");
                for(int q = 1; q <= f; q++){
                    System.out.print("  ");
                }
                if(i != 2 * n + 1){
                    System.out.print("* ");
                }
                c++;
                e--;
                f--;
            }
            System.out.println();
        }

        


        

    }
}
