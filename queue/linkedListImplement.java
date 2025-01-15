

public class linkedListImplement {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class queueLL{
        Node head = null;
        Node tail = null;
        int size = 0;
        void add(int x){
            Node temp = new Node(x);
            if(size == 0){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = tail.next;
            }
            size++;
        }
        int peek(){
            if(size == 0){
                System.out.print("queue is empty");
                return -1;
            }
            return head.val;
        }
        int remove(){
            if(size == 0){
                System.out.print("queue is empty");
                return -1;
            }
            int a = head.val;
            head = head.next;
            size--;
            return a;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
    }
    public static void main(String[] args) {
        queueLL ak = new queueLL();
        ak.add(1);
        ak.add(2);
        ak.add(3);
        ak.add(4);
        ak.add(5);
        ak.remove(); // 2 3 4 5  
        System.out.println(ak.peek()); // 2
        ak.display(); // 2 3 4 5 
        System.out.println(ak.size()); // 4
    }
}
