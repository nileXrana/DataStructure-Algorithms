import java.util.Scanner;
public class loops_ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of terms : ");
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        for(int i = 1; i <= n; i++){
            if(i == 1) System.out.println(a);
            else if(i == 2) System.out.println(b);
            else{
                System.out.println(a+b);
            b = a + b;
            a = b - a;
            }

        }






        sc.close();
    }
}
