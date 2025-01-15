import java.util.Scanner;
public class pattern_printing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("enter number of rows : ");
        // int r = sc.nextInt();
        // System.out.print("enter number of columns : ");
        // int c = sc.nextInt();
        // for(int i = 1; i <= r; i++){        //row
        //     for(int j = 1; j <= c; j++){     //column
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        //print square 
        // System.out.print("enter number : ");
        // int n = sc.nextInt();
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        //print number square
        // System.out.print("enter number : ");
        // int n = sc.nextInt();
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        //rotated number square
        // System.out.print("enter number : ");
        // int n = sc.nextInt();
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n; j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }


        //alphabet square
        // System.out.print("enter number : ");
        // int n = sc.nextInt();

        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n; j++){
        //         System.out.print((char)(j+64)+" ");
                

        //     }
        //     System.out.println();
        // }


        //alphabet square
        // System.out.print("enter number : ");
        // int n = sc.nextInt();
        // int a = 65;

        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n; j++){
        //         System.out.print((char)(a)+" ");
                

        //     }
        //     a++;
        //     System.out.println();
        // }


        //alphabet square
        System.out.print("enter number : ");
        int n = sc.nextInt();
        //int a = 97;

        for(int i = 1; i <= n; i++){
            for(int j = 97; j <= n+96; j++){
                System.out.print((char)(j)+" ");
                //a++;
                

            }
            //a = 97;
            System.out.println();
        }






        sc.close();
    }
}
