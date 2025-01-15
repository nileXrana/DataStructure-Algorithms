//package java_code.basic sorting algorithms;

public class sortInDecreasing {
    public static void main(String[] args) {
        // bubble sort
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        boolean bool = true;
        for(int x = 0; x < n - 1; x++){
            for(int i = 0; i < n - 1 - x; i++){
                if(arr[i] < arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    bool = false;
                }
            }
            if(bool == true) break;
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
