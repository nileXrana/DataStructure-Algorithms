public class arrayImplement {
    public static class Stack{
        int[] arr = new int[5];
        int i = 0;
        void push(int x){
            if(isFull()){
                System.out.print("Error : Stack is full !");
                return;
            }
            arr[i] = x;
            i++;
        }
        int peek(){
            if(i == 0){
                System.out.print("Stack is empty");
                return -1;
            }
            else return arr[i-1];
        }
        int pop(){
            if(i == 0){
                System.out.print("Stack is empty");
                return -1;
            }
            int n = arr[i-1];
            arr[i-1] = 0;
            i--;
            return n;
        }
        void display(){
            int temp = 0;
            while(temp < i){
                System.out.print(arr[temp]+" ");
                temp++;
            }
        }
        int size(){
            System.out.print("size is : ");
            return i;
        }
        boolean isEmpty(){
            if(i == 0) return true;
            else return false;
        }
        boolean isFull(){
            if(i == arr.length) return true;
            else return false;
        }
        int capacity(){
            System.out.print("capacity is : ");
            return arr.length;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st.peek());
        int a = st.pop(); // pop has 2 functionalities
        st.display();
        System.out.println();
        System.out.println(st.size());
        st.push(10);
        st.display();
        System.out.println();
        System.out.println(st.isFull());
        st.push(111);
        System.out.println();
        System.out.println(st.capacity());
    }
}
