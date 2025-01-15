
public class display {
    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left); // left subtree
        display(root.right); // right subtree
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        
        // to display(magic)
        display(a);
    }
}
