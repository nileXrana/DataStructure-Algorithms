import java.util.Scanner;

public class gcd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int ak = 0;
        if(n1 == n2) System.out.println("gcd is "+n1);
        else if(n1 < n2){
            for(int i = 1; i <= n1; i++){
                if(n1 % i == 0){
                    if(n2 % i == 0){
                        ak = i;
                    }
                }
            }
            System.out.println("gcd is "+ak);
        }
        else{
            for(int i = 1; i <= n2; i++){
                if(n2 % i == 0){
                    if(n1 % i == 0){
                        ak = i;
                    }
                }
            }
            System.out.println("gcd is "+ak);
        }
       
    



    }
}
