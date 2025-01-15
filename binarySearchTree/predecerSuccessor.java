import java.util.*;
public class predecerSuccessor {
    static Node p;
    static Node pred;
    static Node succ;
    public static void inorder(Node root, int key, List<Integer> al){
        if(root == null) return;
        inorder(root.left,key,al);
        al.add(root.val);
        inorder(root.right,key,al);
    }
    public static void main(String[] args) {
        p = null;
        pred = null;
        succ = null;
        Scanner sc = new Scanner(System.in);
        Node a = new Node(50);
        Node b = new Node(30);
        Node c = new Node(70);
        Node d = new Node(20);
        Node e = new Node(40);
        Node f = new Node(60);
        Node g = new Node(80);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        System.out.print("enter key : ");
        int key = sc.nextInt();
        List<Integer> al = new ArrayList<>();
        inorder(a,key,al);
        int n = al.size();
        int ak = 0;
        while(al.get(ak) != key) ak++;
        if(ak == 0){
            System.out.println("no inorder predecer");
            System.out.println("inorder successor : "+al.get(ak+1));
        }
        else if(ak == n-1){
            System.out.println("inorder predecer : "+al.get(ak-1));
            System.out.println("no inorder successor");
        }
        else{
            System.out.println("inorder predecer : "+al.get(ak-1));
            System.out.println("inorder successor : "+al.get(ak+1));
        }
    }
}
