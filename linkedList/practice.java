public class practice {
    public static class Node{
        int val;
        Node next;
    
        public Node(int value){
            this.val = value;
        }
    }
    public static class linkedlist{
        Node head;
        Node tail;
        int s = 0;

        int size(){
            return s;
        }
        void add(int value){
            Node temp = new Node(value);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            s++;
        }
        void print(){
            if(head == null){
                System.out.println("linkedlist is empty");
            }
            else{
                Node x = head;
                while(x != null){
                    System.out.print(x.val+" ");
                    x = x.next;
                }
            }
        }
        void set(int index, int value){
            Node temp = new Node(value);
            if(index >= s || index < 0){
                System.out.println("invalid index");
            }
            if(index == s-1){
                add(value);
                return;
            }
            if(index == 0){
                head.val = value;
                return;
            }
            Node x = head;
            for(int i = 0; i < index-1; i++){
                x = x.next;
            }
            temp.next = x.next.next;
            x.next = temp;
        }
        int get(int index) throws Error{
            if(index < 0 || index >= s){
                throw new Error("invald index bhai !");
            }
            Node x = head;
            for(int i = 0; i < index; i++){
                x = x.next;
            }
            return x.val;
        }
        void deleteAt(int index) throws Error{
            if(index < 0 || index >= s){
                throw new Error("invalid index bro !");
            }
            if(index == 0){
                head = head.next;
                return;
            }
            Node x = head;
            for(int i = 0; i < index-1; i++){
                x = x.next;
            }
            if(x.next == tail) tail = x; // v.v.important
            x.next = x.next.next;
            s--;
        }
    }
    public static void main(String[] args) {
        linkedlist arr = new linkedlist();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.set(0,1);
        arr.print(); 
        System.out.println();
        System.out.println(arr.get(4));
        arr.set(0,10);
        arr.print();
        System.out.println();
        arr.deleteAt(4);
        arr.deleteAt(3);
        arr.print();
    }
}
