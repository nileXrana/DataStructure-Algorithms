import java.util.*;

public class morrisTraversal {
    public static Node p(Node curr){ // inorder predecessor
        Node temp = curr.left;
        while(temp.right != null && temp.right != curr) temp = temp.right;
        return temp;
    }
    public static void main(String[] args) {
        // binary tree : 
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        // inorder : 2 4 6 1 3 5

        // binary search tree :
        Node aa = new Node(5);
        Node bb = new Node(2);
        Node cc = new Node(8);
        Node dd = new Node(1);
        Node ee = new Node(4);
        Node ff = new Node(6);
        Node gg = new Node(9);
        Node hh = new Node(3);
        Node ii = new Node(7);
        Node jj = new Node(10);
        aa.left = bb; aa.right = cc;
        bb.left = dd; bb.right = ee;
        cc.left = ff; cc.right = gg;
        ee.left = hh;
        ff.right = ii;
        gg.right = jj;
        // inorder : 1 2 3 4 5 6 7 8 9 10

        List<Integer> ans = new ArrayList<>();
        Node curr = aa;
        while(curr != null){
            if(curr.left != null){
                Node pred = p(curr); // pred
                if(pred.right == null){ // link
                    pred.right = curr;
                    curr = curr.left;
                }
                else{ // unlink
                    ans.add(curr.val);
                    curr = curr.right;
                    pred.right = null;
                }
            }
            else{
                ans.add(curr.val);
                curr = curr.right;
            }
        }
        System.out.println(ans);

    }
}
