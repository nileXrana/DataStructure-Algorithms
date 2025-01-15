
import java.util.PriorityQueue;

public class minHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(11);
        pq.add(5);
        pq.add(14);
        pq.add(-1);
        pq.add(13);
        System.out.println(pq);
    }
}
