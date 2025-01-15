import java.util.*;
public class subSet {
    static List<String> arr = new ArrayList<>(); // global
    public static void subset(int i, String str, String ans){
        if(i == str.length()){
            // arr.add(ans);
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(i);
        subset(i+1,str,ans+ch);
        subset(i+1,str,ans);
    }
    public static void main(String[] args) {
        String str = "abcd";
        //arr = new ArrayList<>();
        subset(0,str,"");
        //System.out.println(arr);
    }
}
