import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcde");
        int n = sb.length();
        int a = 0;
        int b = n - 1;
        while(a < b){
            char temp = sb.charAt(a);
            sb.setCharAt(a,sb.charAt(b));
            sb.setCharAt(b,temp);
            a++;
            b--;
        }
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
