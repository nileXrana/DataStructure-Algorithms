import java.util.*;
public class reverse {
    public static void pushAtBottom(Stack<Integer> st,int n){
        if(st.size() == 0){
            st.push(n);
            return;
        }
        int ak = st.peek();
        st.pop();
        pushAtBottom(st,n);
        st.push(ak);
    }
    public static void reverseIt(Stack<Integer> st){
        if(st.size() == 1) return;
        int ak = st.peek();
        st.pop();
        reverseIt(st);
        pushAtBottom(st,ak);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverseIt(st);
        System.out.println(st);
        reverseIt(st);
        System.out.println(st);
    }
}
