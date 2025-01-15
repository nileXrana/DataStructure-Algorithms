import java.util.*;
public class displayStack {
    public static void displayReverse(Stack<Integer> s){
        if(s.size() == 0) return;
        int n = s.peek();
        System.out.print(s.peek()+" ");
        s.pop();
        displayReverse(s);
        s.push(n);
    }
    public static void display(Stack<Integer> s){
        if(s.size() == 0) return;
        int n = s.peek();
        s.pop();
        display(s);
        System.out.print(n+" ");
        s.push(n);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        // implement using stack
        // Stack<Integer> st2 = new Stack<>();
        // while(st.size() != 0){
        //     st2.push(st.pop());
        // }
        // while(st2.size() != 0){
        //     System.out.print(st2.peek()+" ");
        //     st.push(st2.pop());
        // }

        // implement using array****
        // int[] arr = new int[st.size()];
        // for(int i = arr.length-1; i >= 0; i--){
        //     arr[i] = st.peek();
        //     st.pop();
        // }
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i]+" ");
        //     st.push(arr[i]);
        // }

        // implement using magic
        displayReverse(st);
        System.out.println();
        displayReverse(st);
        System.out.println();
        display(st);
        System.out.println();
        display(st);
    
    }
}


