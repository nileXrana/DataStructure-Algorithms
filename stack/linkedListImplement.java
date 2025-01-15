public class linkedListImplement {
    public static class Node{ // user defined data type
        int val;
        Node next;
        Node(int val){ // constructor
            this.val = val;
        }
    }
    public static class Stack{ // user defined data structure
        Node head = null;
        int size = 0;
        void push(int n){
            Node temp = new Node(n);
            temp.next = head;
            head = temp;
            size++;
        }
        int peek(){
            if(head == null){
                System.out.print("Stack is empty !");
                return -1;
            }
            return head.val;
        }
        int pop(){
            if(head == null){
                System.out.println("Error : Stack is empty");
            }
            int ak = head.val;
            head = head.next;
            size--;
            return ak;
        }
        int size(){
            return size;
        }
        void displayRec(Node h){ // basic recursion
            if(h == null) return;
            displayRec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayRec(head);
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10); // 10
        st.push(20); // 10 20
        st.push(30); // 10 20 30
        System.out.println(st.peek()); // 30
        int ak = st.pop(); // 10 20 
        System.out.println(st.peek()); // 20
        System.out.println(st.size()); // 2
        st.push(100);
        st.push(200);
        st.push(300);
        st.display(); // 10 20 100 200
        
    }
}
