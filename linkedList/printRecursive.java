//package java_code.linkedList;

public class printRecursive {
    public static void display(Node head){
        if(head == null) return;
        System.out.println(head.val);
        display(head.next);
    }
    public static class Node{
        int val;
        Node next;

        public Node(int val){  // constructor
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;  // link
        b.next = c;
        c.next = d;
        d.next = e;
        // print recursively
        display(a);

        
        
    }
}
