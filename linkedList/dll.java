class doublyList{
    dNode head;
    dNode tail;
    int s = 0;
    void insert(int value){
        insertAtTail(value);
    }
    void set(int indx, int value){
        if(indx == 0){
            head.val = value;
            return;
        }
        if(indx == s-1){
            tail.val = value;
            return;
        }
        if(indx < 0 || indx >= s){
            System.out.println("error : index out of bond");
            return;
        }
        dNode temp = head;
        for(int i = 0; i < indx; i++){
            temp = temp.next;
        }
        temp.val = value;
    }
    int get(int indx){
        if(indx < 0 || indx >= s){
            System.out.print("index out of bond baby");
            return -1;
        }
        if(indx == 0){
            return head.val;
        }
        if(indx == s-1){
            return tail.val;
        }
        dNode temp = head;
        for(int i = 0; i < indx; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void delete(int indx){
        if(indx == 0){
            deleteAtHead();
            return;
        }
        if(indx == s-1){
            deleteAtTail();
            return;
        }
        if(indx > s-1 || indx < 0){
            System.out.println("error : index out of bond");
            return;
        }
        dNode temp = head;
        for(int i = 0; i < indx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp = temp.next;
        temp.prev = temp.prev.prev;
        s--;
    }
    void deleteAtTail(){
        if(head == null){
            System.out.println("kux hai hi ni bhai kya delete karu");
            return;
        }
        if(tail.prev == null){
            head = null;
            tail = null;
            s--;
            return;
        }
        tail = tail.prev;
        tail.next = null;
        s--;
    }
    void deleteAtHead(){
        if(head == null){
            System.out.println("kuch hai hi ni bhai kya delete karu");
            return;
        }
        if(head.next == null){
            head = null;
            tail = null;
            s--;
            return;
        }
        head = head.next;
        head.prev = null;
        s--;
    }
    void insert(int indx, int value){
        if(indx == 0){
            insertAtHead(value);
            return;
        }
        if(indx == s){
            insertAtTail(value);
            return;
        }
        dNode t = head;
        for(int i = 0; i < indx-1; i++){
            t = t.next;
        }
        dNode tt = t.next;
        dNode temp = new dNode(value);
        t.next = temp;
        temp.prev = t;
        temp.next = tt;
        tt.prev = temp;
        s++;
    }
    void size(){
        System.out.println("size is "+s);
    }
    public void display(){
        if(head == null) return;
        else{
            dNode temp = head;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
        }
    }
    public void insertAtTail(int val){
        if(head == null){
            dNode temp = new dNode(val);
            head = temp;
            tail = temp;
            s++;
        }
        else{
            dNode temp = new dNode(val);
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
                s++;
        }
    }
    void insertAtHead(int val){
        if(head == null){
            dNode temp = new dNode(val);
            head = temp;
            tail = temp;
            s++;
        }
        else{
            dNode temp = new dNode(val);
            temp.next = head;
            head.prev = temp;
            head = temp;
            s++;
        }
    }
}
public class dll{
    public static void main(String[] args) {
        doublyList ak = new doublyList();
        ak.insertAtTail(10);
        ak.insertAtTail(20);
        ak.insertAtTail(30);
        ak.display();
        System.out.println();
        ak.size();
        ak.insertAtHead(1);
        ak.insertAtHead(2);
        ak.insertAtHead(3);
        ak.display();
        System.out.println();
        System.out.println(ak.head.val);
        ak.insert(3,5);
        ak.insert(7,100);
        ak.display();
        ak.deleteAtHead();
        System.out.println();
        ak.display();
        ak.deleteAtTail();
        ak.deleteAtTail();
        // ak.deleteAtTail();
        // ak.deleteAtTail();
        // ak.deleteAtTail();
        // ak.deleteAtTail();
        System.out.println();
        ak.deleteAtHead();
        ak.display();
        System.out.println();
        ak.size();
        ak.delete(3);
        ak.display();
        System.out.println();
        ak.size();
        System.out.println(ak.get(2));
        ak.set(1,7); // updating value
        ak.display();
        System.out.println();
        ak.delete(0);
        ak.size();
        ak.display();
        ak.insert(69);
        System.out.println();
        ak.display();
        System.out.println();
        ak.size();

    }
}
