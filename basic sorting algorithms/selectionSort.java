//package java_code.basic sorting algorithms;

public class selectionSort {
    public static void main(String[] args) {
        // selection sort
        int[] arr = {3,5,2,1,4};
        int ind = 0;
        for(int x = 0; x < arr.length - 1; x++){
            int min = arr[x];
            for(int i = x; i < arr.length; i++){
                if(arr[i] < min){
                    min = arr[i];
                    ind = i;
                }
            }
            int temp = arr[x];
            arr[x] = arr[ind];
            arr[ind] = temp;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
