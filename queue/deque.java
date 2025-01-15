import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();
        // 6 operations
        q.addLast(1);
        q.addLast(2);
        q.addLast(3);
        q.addLast(1);
        q.addLast(5);
        q.addFirst(0);
        System.out.println(q);
        q.removeFirst();
        System.out.println(q);
        System.out.println(q.getLast());
        System.out.println(q.removeLastOccurrence(1));
        System.out.println(q);
    }
}
