import java.util.*;

public class print {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // print
        Queue<Integer> q2 = new LinkedList<>();
        while(q.size() != 0){
            q2.add(q.peek());
            System.out.print(q.remove()+" ");
        }
        while(q2.size() != 0){
            q.add(q2.remove());
        }
        
        
    }
}
