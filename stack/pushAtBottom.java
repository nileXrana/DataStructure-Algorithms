import java.util.*;
public class pushAtBottom {
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
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        pushAtBottom(st,5);
        System.out.println(st);
        pushAtBottom(st,10);
        System.out.println(st);
    }
}
