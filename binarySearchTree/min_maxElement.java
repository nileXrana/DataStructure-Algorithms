class Node{
    int val;
    Node left;
    Node right;
    Node(int val){ // constructor
        this.val = val;
    }
}
public class min_maxElement {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(5);
        Node c = new Node(15);
        Node d = new Node(2);
        Node e = new Node(8);
        Node f = new Node(12);
        Node g = new Node(19);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        // find min & max element without dfs/bfs
        Node temp = a;
        while(temp.left != null) temp = temp.left;
        System.out.println("minimum element is "+temp.val);
        
        temp = a;
        while(temp.right != null) temp = temp.right;
        System.out.println("maximum element is "+temp.val);

    }
}
