class level{
    public static int levelOfTree(Node root){
        if(root == null) return 0;
        int lst = levelOfTree(root.left);
        int rst = levelOfTree(root.right);
        return 1 + Math.max(lst,rst);
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

        int level = levelOfTree(a);
        System.out.println("level of tree is "+level);
        System.out.println("height of tree is "+(level-1));
    }
}