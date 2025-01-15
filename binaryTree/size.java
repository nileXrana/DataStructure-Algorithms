
public class size {
    public static int sizeOfTree(Node root){
        if(root == null) return 0;
        int a = sizeOfTree(root.left);
        int b = sizeOfTree(root.right); 
        return 1 + a + b;
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

        System.out.println(sizeOfTree(a));
    }
}
