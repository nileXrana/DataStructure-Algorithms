import java.util.Scanner;

public class pp_last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter input : ");
        int n = sc.nextInt();
        int a = n - 1;
        int b = 1;
        int c = 2;
        int d = 2 * n - 5;

        for(int i = 1; i <= 2 * n - 1; i++){
            if(i == 1 || i == 2 * n - 1){
                for(int j = 1; j <= 2 * n - 1; j++){
                    System.out.print("* ");
                }
            }
            else if(i <= n){
                for(int k = 1; k <= a; k++){
                    System.out.print("* ");
                }
                for(int l = 1; l <= b; l++){
                    System.out.print("  ");
                }
                for(int m = 1; m <= a; m++){
                    System.out.print("* ");
                }
                a--;
                b += 2;
            }
            else{
                for(int o = 1; o <= c; o++){
                    System.out.print("* ");
                }
                for(int p = 1; p <= d; p++){
                    System.out.print("  ");
                }
                for(int q = 1; q <= c; q++){
                    System.out.print("* ");
                }
                c++;
                d-=2;
                
            }
            System.out.println();
        }
        
    }
}
