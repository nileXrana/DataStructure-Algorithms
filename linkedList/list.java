public class list {
    public static class Node{
        int val;
        Node next;

        public Node(int val){  // constructor
            this.val = val;
        }
    }
    public static class linkedlist{
        Node head;  // null
        Node tail;  // null
        int size = 0;
        public void add(int n){
            Node temp = new Node(n);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
        }
        public void addE(int v){
            Node temp = new Node(v);
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
        public void add(int indx, int value){
            if(indx == 0){
                addE(indx);
                return;
            }
            if(indx == size){
                add(indx);
                return;
            }
            if(indx > size){
                System.out.println("Invalid Index");
                return;
            }
            Node temp = new Node(value);
            Node x = head; // new node nahi bana hai(just a shallow copy)
            for(int i = 0; i < indx-1; i++){
                x = x.next;
            }
            temp.next = x.next;
            x.next = temp;
            size++;
        }
        public int get(int indx) throws Error{
            if(indx >= size || indx < 0){
                throw new Error("index to sahi de bhai !");
            }
            Node x = head;
            for(int i = 0; i < indx; i++){
                x = x.next;
            }
            return x.val;
        }
        public void set(int indx, int value) throws Error{
            if(indx < 0 || indx >= size){
                throw new Error("Index Invalid");
            }
            Node x = head;
            for(int i = 0; i < indx; i++){
                x = x.next;
            }
            x.val = value;
        }
        public void deleteAtHead(){
            if(head == null){
                System.out.println("list is empty");
            }
            head = head.next;
            size--;
        }
        public void deleteAt(int indx){
            if(indx < 0 || indx >= size){
                System.out.println("error index");
                return;
            }
            if(indx == 0){
                deleteAtHead();
                return;
            }
            Node x = head;
            for(int i = 0; i < indx-1; i++){
                x = x.next;
            }
            if(indx == size - 1) tail = x;
            x.next = x.next.next;
            size--;
        }
    }
    public static void main(String[] args) {
        linkedlist a = new linkedlist();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.display();
        System.out.println();
        System.out.println(a.size);
        a.addE(60);
        a.addE(1);
        a.display();
        a.add(2,45);
        System.out.println();
        a.display();
        System.out.println();
        a.add(10,23);
        System.out.println();
        System.out.println();

        linkedlist arr = new linkedlist();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.display();
        System.out.println();
        System.out.println(arr.get(4));
        arr.set(0,0);
        arr.set(4,0);
        arr.display();
        // delete
        arr.deleteAtHead();
        System.out.println();
        arr.display();
        arr.deleteAt(3);
        System.out.println();
        arr.display();
        System.out.println();
        System.out.println(arr.size);
        System.out.println(arr.tail.val);
    
    }
}
