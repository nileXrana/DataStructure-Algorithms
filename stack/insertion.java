import java.util.*;
public class insertion{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        int k = 10;
        int indx = 3;
        Stack<Integer> st2 = new Stack<>();
        while(st.size() != indx){
            st2.push(st.pop());
        }
        st.push(k);
        while(st2.size() != 0){
            st.push(st2.pop());
        }
        System.out.println(st);
    }
}