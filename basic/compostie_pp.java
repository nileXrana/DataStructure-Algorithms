import java.util.Scanner;
public class compostie_pp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n - i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int k = 1; k <= i; k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        
        // int n = sc.nextInt();
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n - i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }



        //rhombus
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            for(int j = 1; j<=i - 1; j++){
                System.out.print("  ");
            }
            System.out.println();
        }


        


        sc.close();
    }
}
