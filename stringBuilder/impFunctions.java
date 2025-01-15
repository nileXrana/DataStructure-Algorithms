import java.util.*;

public class impFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        sb.setCharAt(0,'Z');
        System.out.println(sb);
    }
}
