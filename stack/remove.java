import java.util.Stack;

public class remove{
    public static void remove(Stack<Integer> st, int indx){
        Stack<Integer> st2 = new Stack<>();
        while(st.size() != indx+1){
            st2.push(st.pop());
        }
        st.pop();
        while(st2.size() != 0){
            st.push(st2.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        remove(st,3);
        System.out.println(st);

    }
}