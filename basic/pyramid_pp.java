import java.util.Scanner;
public class pyramid_pp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n - i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j = 1; j <= i * 2 - 1; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        //same ques without maths(important)
        int n = sc.nextInt();
        int sp = n - 1;
        int st = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= sp; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= st; j++){
                System.out.print("* ");
            }
            System.out.println();
            sp--;
            st+=2;
        }





        sc.close();
    }
}
