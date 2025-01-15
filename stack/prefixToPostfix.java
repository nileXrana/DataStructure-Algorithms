import java.util.Stack;

public class prefixToPostfix {
    public static void main(String[] args) {
        String str = "-9/*+5346"; //prefix
        Stack<String> st = new Stack<>();
        for(int i = str.length()-1; i >= 0; i--){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57){
                String ak = "";
                ak += ascii-48;
                st.push(ak);
            }
            else{
                String v1 = st.pop(); // *
                String v2 = st.pop();
                String o = "";
                o = o + v1 + v2 + ch;
                st.push(o);
            }
        }
        System.out.println(st.peek());
    }
}
