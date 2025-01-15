import java.util.*;

public class insertAtBottom {
    public static void main(String[] args) {
        int k = 500; //insert at bottom
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        Stack<Integer> st2 = new Stack<>();
        while(st.size() != 0){
            st2.push(st.pop());
        }
        st.push(k);
        while(st2.size() != 0){
            st.push(st2.pop());
        }
        System.out.println(st);

    }
}
