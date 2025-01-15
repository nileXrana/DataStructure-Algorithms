public class temp {
    public static class linkedlist{
        Node head;
        Node tail;

        public void add(int a){
            Node temp = new Node(a);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }
        }
        public void print(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
        }
        public void addB(int n){
            Node temp = new Node(n);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
        }
    }
    public static class Node{
        int val;
        Node next;

        public Node(int val){ // constructor
            this.val = val;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.print();
        ll.addB(1);
        System.out.println();
        ll.print();

    }
}
