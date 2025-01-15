//package java_code.basic sorting algorithms;
import java.util.*;
public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {3,5,1,4,2};
        int n = arr.length;
        // insertion sort (smallese code)
        // for(int i = 1; i < n; i++){
        //     for(int j = i; j >= 1; j--){
        //         if(arr[j] < arr[j-1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j-1];
        //             arr[j-1] = temp;
        //         }
        //         else break;
        //     }
        // }

        // standard code for insertion sort
        for(int i = 1; i < n; i++){
            int a = i;
            while(a >= 1 && arr[a] < arr[a-1]){
                int temp = arr[a];
                arr[a] = arr[a-1];
                arr[a-1] = temp;
                a--;
            }
        }

        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
