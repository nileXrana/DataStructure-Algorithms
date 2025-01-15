import java.util.Scanner;
public class bridgePP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();
        int a = n - 1;
        for(int i = 1; i <= 2 * n - 1; i++){
            if(i <= n){
                System.out.print(i+" ");
            }
            else{
                System.out.print(a+" ");
                a--;
            }
        }
        System.out.println();
        
        int b = n - 1;
        int d = 1;
        for(int i = 1; i <= n - 1; i++){
            int c = 1;
            for(int j = 1; j <= b; j++){
                System.out.print(c+" ");
                c++;
            }

            for(int k = 1; k <= d; k++){
                System.out.print("  ");
            }
            
            int e = b;
            for(int l = 1; l <= b; l++){
                System.out.print(e+" ");
                e--;
            }

            d += 2;
            b--;
            System.out.println();
        }

        
        
        
        
        

    }
}
