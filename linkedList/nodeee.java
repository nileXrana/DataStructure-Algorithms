
public class nodeee {
    public static class Node{
        int v;
        Node next;

        public Node(int v){
            this.v = v;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        // System.out.println(a);
        // System.out.println(a.v);
        // System.out.println(a.next);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        a.next = b; // link
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // System.out.println(a.v);
        // System.out.println(a.next.v);
        // System.out.println(a.next.next.v);
        // System.out.println(a.next.next.next.v);
        // System.out.println(a.next.next.next.next.v);
        Node temp = a;  //shallow copy
        while(temp != null){
            System.out.println(temp.v);
            temp = temp.next;
        }
    }
}
