

public class arrayImplement {
    public static class queueA{
        int f = -1; // front
        int r = -1; // rear
        int size = 0;
        int[] arr = new int[100];
        void add(int val){
            if(r == arr.length-1){
                System.out.println("queue is full");
                return;
            }
            if(r == -1){
                arr[r+1] = val;
                r = 0; 
                f = 0;
                size++;
            }
            else{
                arr[r+1] = val;
                r++;
                size++;
            }
        }
        int remove(){
            if(size == 0){
                System.out.println("queue is empty");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }
        int peek(){
            if(size == 0){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[f];
        }
        int size(){
            return size;
        }
        void display(){
            if(size == 0) System.out.println("[]");
            else{
                for(int i = f; i <= r; i++){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        queueA ak = new queueA();
        ak.add(1);
        ak.add(2);
        ak.add(3);
        ak.add(4);
        ak.add(5);
        ak.remove();
        System.out.println(ak.peek());
        System.out.println(ak.size());
        ak.display(); // 2 3 4 5
    }
}
