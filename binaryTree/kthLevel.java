
public class kthLevel {
    static int k;
    public static void printLevel(Node root, int level){
        if(root == null) return;
        if(level == k) System.out.print(root.val+" ");
        printLevel(root.left, level+1);
        printLevel(root.right, level+1);
    }
    public static void main(String[] args) {
        Node a = new Node(1); // root node
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.left = h;
        f.right = i;

        for(int x = 0; x <= 3; x++){
            k = x;
            printLevel(a,0);
            System.out.println();
        }
        

    }
}
