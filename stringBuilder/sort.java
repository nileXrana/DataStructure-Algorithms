import java.util.*;
public class sort {
    public static void main(String[] args) {
        String str = "nilesh";  // to reverse
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        for(char x : ch){
            System.out.print(x);
        }
        System.out.println();
        StringBuilder sb = new StringBuilder("rana");
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
    }
}
