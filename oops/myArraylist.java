import java.util.Arrays;

public class myArraylist {
    public static class arraylist{
        int[] arr = new int[5];
        int indx = 0;
        int size = 0;
        public void add(int i){
            if(size == arr.length){
                int[] brr = Arrays.copyOf(arr, 2*arr.length);
                arr = brr; // brr ka name arr kar do
            }
            arr[indx] = i;
            indx++;
            size++;
        }
        public int size(){
            return size;
        }
        public int get(int a){
            return arr[a];
        }
        public void set(int i, int j){
            arr[i] = j;
        }
    }
    public static void main(String[] args) {
        arraylist arr = new arraylist();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println(arr.size());
        System.out.println(arr.get(5));
        arr.set(0,100);
        System.out.println(arr.get(0));
    }
}
