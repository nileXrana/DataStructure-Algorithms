import java.util.Scanner;
public class pp_using_variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();

        // star diamond
        // int b = n - 1;
        // int c = 1;
        // int d = 1;
        // int f = 2 * n - 1 - 2;
        // for(int i = 1; i <= 2 * n - 1; i++){
        //     if(b >= 0){
        //         for(int j = 1; j <= b; j++){
        //         System.out.print("  ");
        //         }
        //         b--;
        //     }
        //     else{
        //         for(int k = 1; k <= c; k++){
        //             System.out.print("  ");
        //         }
        //         c++;
        //     }
        //     if(d <= 2 * n - 1){
        //         for(int l = 1; l <= d; l++){
        //         System.out.print("* ");
        //         }
        //         d+=2;
        //     }
        //     else{
        //         for(int m = 1; m <= f; m++){
        //             System.out.print("* ");
        //         }
        //         f-=2;
        //     }
        //     System.out.println();
        // }


        // triangle
        // int a = 0;
        // int b = n;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= a; j++){
        //         System.out.print("  ");
        //     }
        //     for(int k = 1; k <= b; k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        //     a++;
        //     b--;
        // }


        // number triangle
        // int a;
        // for(int i = 1; i <= n; i++){
        //     a = i;
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(a+" ");
        //         a--;
                
        //     }
        //     System.out.println();

        // }


        // number spiral
        // for(int i = 1; i <= 2 * n - 1; i++){
        //     for(int j = 1; j <= 2 * n - 1; j++){
        //         int a = i;
        //         int b = j;
        //         if(i > n) a = 2 * n - i;
        //         if(j > n) b = 2 * n - j;
        //         System.out.print(n + 1 - Math.min(a,b)+" ");
        //     }

        //     System.out.println();
        // }


        // strong number 
        int digit;
        int answer = 0;
        for(int i = n; i != 0; i/=10){
            digit = i % 10;
            int sum = 1;
            for(int j = digit; j != 0; j--){
                sum *= j;
            }
            answer += sum;
        }
        if(answer == n) System.out.println("strong number");
        else System.out.println("not a strong number");







        sc.close();
    }
}
