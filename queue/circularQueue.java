
public class circularQueue {
    public static class cqa{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];
        void add(int x) throws Exception{
            if(size == arr.length){
                throw new Exception("queue is full");
            }
            else if(size == 0){
                f = r = 0;
                arr[0] = x;
                size++;
            }
            else if(r<arr.length-1){ // normal case
                arr[r+1] = x;
                r++;
                size++;
            }
            else if(r == arr.length-1){ // new case
                r = 0;
                arr[0] = x;
                size++;
            }
        }
        int remove() throws Exception{
            if(size == 0){
                throw new Exception("Queue is Empty!");
            }
            else{
                int x = arr[f];
                if(f == arr.length-1) f = 0;
                else f++;
                size--;
                return x;
            }
        }
        int peek() throws Exception{
            if(size == 0){
                throw new Exception("queue is empty");
            }
            else return arr[f];
        }
        void display(){
            if(size == 0){
                System.out.println("queue is empty");
                return;
            }
            else if(f <= r){
                for(int i = f; i <= r; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else{
                for(int i = f; i < arr.length; i++){
                    System.out.print(arr[i]+" ");
                }
                for(int j = 0; j <= r; j++){
                    System.out.print(arr[j]+" ");
                }
            }
            System.out.println();
        }
        int size(){
            return size;
        }
    }
    public static void main(String[] args) throws Exception{
        cqa ak = new cqa();
        ak.add(1);
        ak.add(2);
        ak.add(3);
        ak.add(4);
        ak.add(5);
        ak.display(); // 1 2 3 4 5
        ak.remove();
        ak.display(); // 2 3 4 5
        ak.add(10); // 2 3 4 5 10
        ak.display();
        System.out.println(ak.size());
        
    }
}
