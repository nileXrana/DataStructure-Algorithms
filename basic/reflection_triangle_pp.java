import java.util.Scanner;
public class reflection_triangle_pp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("enter number : ");
        // int n = sc.nextInt();
        // int a = n;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= a; j++){
        //         System.out.print((char)(j+96)+" ");
        //     }
        //     a-=1;
        //     System.out.println();
        // }


        //odd triangle
        // System.out.print("enter number : ");
        // int n = sc.nextInt();
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print((2 * j - 1)+" ");
            

                
        //     }
        //     System.out.println();
        // }


        //floids triangle
        System.out.print("enter number : ");
        int n = sc.nextInt();
        int a = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(a+++" ");
                
            

                
            }
        
            System.out.println();
        }





        sc.close();
    }
}
