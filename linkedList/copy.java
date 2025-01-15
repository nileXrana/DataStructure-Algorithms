
public class copy {
    public static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = a;  // shallow copy
        b.val = 100;
        System.out.println(a.val);

    }
}
