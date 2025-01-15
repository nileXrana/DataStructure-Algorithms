import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string : ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < sb.length(); i++){
            int a = (int)sb.charAt(i);
            if(a < 91){
                a += 32;
                sb.setCharAt(i,(char)a);
            }
            else{
                a -= 32;
                sb.setCharAt(i,(char)a);
            }
        }
        System.out.println(sb);
        
    }
}
