// user define data type
class dNode{
    int val;
    dNode next;
    dNode prev;
    dNode(int val){  // constructor
        this.val = val;
    }
}
public class doublyLinkedList {
    public static void main(String[] args) {
        dNode a = new dNode(10);
        dNode b = new dNode(20);
        dNode c = new dNode(30);
        dNode d = new dNode(40);
        a.next = b;
        b.next = c;
        c.next = d;
        b.prev = a;
        c.prev = b;
        d.prev = c;
        // print from head
        dNode temp = a;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
        // print from tail(reverse)
        temp = d;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
    }
}
