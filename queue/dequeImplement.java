
public class dequeImplement {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static class dequeLL{
        Node head;
        Node tail;
        int size = 0;
        void addLast(int x){
            Node temp = new Node(x);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                Node t = tail;
                tail.next = temp;
                tail = temp;
                tail.prev = t;
                tail.next = null;
            }
            size++;
        }
        void addFirst(int x){
            Node temp = new Node(x);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int removeFirst(){
            int ak = head.val;
            head = head.next;
            size--;
            return ak;
        }
        int size(){
            return size;
        }
        int removeLast(){
            if(head == null){
                System.out.print("queue is empty");
                return -1;
            }
            else if(head == tail){
                int ak = tail.val;
                head = tail = null;
                return ak;
            }
            else{
                int a = tail.val;
                tail = tail.prev;
                System.out.println(tail.val);
                tail.next = null;
                return tail.val;
            }
        }
    }
    public static void main(String[] args) {
        dequeLL q = new dequeLL();
        q.addLast(1);
        q.addLast(2);
        q.addLast(3);
       
        q.display();
        System.out.println(q.removeLast());
        q.display();
        
    }
}
