import java.util.*;

public class maxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(1);
        pq.add(11);
        pq.add(5);
        pq.add(14);
        pq.add(-1);
        pq.add(13);
        pq.add(-1);
        pq.add(14);
        System.out.println(pq);
    }
}
