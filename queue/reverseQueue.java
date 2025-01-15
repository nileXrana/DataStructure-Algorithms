import java.util.*;

public class reverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5); // 1 2 3 4 5
        // Stack<Integer> st = new Stack<>();
        // while(q.size() != 0){
        //     st.push(q.remove()); // 1 2 3 4 5
        // }
        // while(st.size() != 0){
        //     q.add(st.pop());
        // }
        // System.out.println(q);

        // reverse first k elements of a queue
        int k = 3;
        Stack<Integer> st = new Stack<>();
        while(st.size() != k){
            st.push(q.remove());
        }
        while(st.size() != 0){
            q.add(st.pop());
        }
        for(int i = 0; i < q.size()-k; i++){
            q.add(q.remove());
        }
        System.out.println(q);
         
    }
}
