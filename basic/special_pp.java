import java.util.Scanner;
public class special_pp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //binary triangle
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){
                // if(i % 2 != 0){
                //     if(j % 2 != 0) System.out.print("1 ");
                //     else System.out.print("0 ");
                // }
                // else{
                //     if(j % 2 == 0) System.out.print("1 ");
                //     else System.out.print("0 ");
                // }



                // if(i % 2 != 0 && j % 2 != 0) System.out.print("1 ");
                // else if(i % 2 == 0 && j % 2 == 0) System.out.print("1 ");
                // else System.out.print("0 ");



                // if((i+j) % 2 == 0) System.out.print("1 ");
                // else System.out.print("0 ");
        //     }
        //     System.out.println();
        // }


        //flipped triangle
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i + j > n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }








        sc.close();
    }
}
