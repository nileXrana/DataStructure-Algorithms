import java.util.Scanner;
public class loops_ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();
        int a = 1;
        for(int i = n; i <= n*10; i+=n){
            System.out.println(n+" * "+a+" = "+i);
            a++;
        }






        sc.close();
    }
}
