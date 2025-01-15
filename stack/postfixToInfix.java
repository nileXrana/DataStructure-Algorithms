import java.util.Stack;

public class postfixToInfix {
    public static void main(String[] args) {
        String str = "953+4*6/-"; //postfix
        Stack<String> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57){
                String ak = "";
                ak += ascii-48;
                st.push(ak);
            }
            else{
                String v2 = st.pop();
                String v1 = st.pop();
                String o = "";
                o = o + "(" + v1 + ch + v2 + ")";
                st.push(o);
            }
        }
        System.out.println(st.peek());
    }
}
