//package java_code.binaryTree;

public class max {
    public static int maxNode(Node root){
        if(root == null) return Integer.MAX_VALUE;
        int a = root.val;
        int b = maxNode(root.left);
        int c = maxNode(root.right);
        return Math.min(a,Math.min(b,c));
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

        System.out.println(maxNode(a));
    }
}
