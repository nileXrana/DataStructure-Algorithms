//package java_code.basic sorting algorithms;
import java.util.*;
public class sortInInc {
    public static void main(String[] args) {
        //  selection sort
        int[] arr = {0,4,3,10,2,1};
        int n = arr.length;
        int ind = 0;
        for(int x = 0; x < n - 1; x++){
            int mx = arr[0];
            for(int i = 0; i < n-1-x; i++){
                if(mx < arr[i+1]){
                    mx = arr[i+1];
                    ind = i+1;
                }
            }
            int temp = arr[n-1-x];
            arr[n-1-x] = arr[ind];
            arr[ind] = temp;
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
