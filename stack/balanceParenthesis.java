import java.util.*;
public class balanceParenthesis {
    public static boolean isBalanced(String str){
        int remove = 0;
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i = 0; i < n; i++){
            if(str.charAt(i) == '(' ){
                st.push('(');
            }
            else{
                if(st.size() == 0) return false;
                st.pop();
            }
        }
        if(st.size() == 0) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
