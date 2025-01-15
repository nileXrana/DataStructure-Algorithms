//package java_code.basic sorting algorithms;
import java.util.*;
public class question2 {
    public static void main(String[] args) {
        int[] arr = {2,3,100,5,1};
        int i = 0;
        int j = 1;
        while(i < arr.length && j < arr.length){
            if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            else j++;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        
        
    }
}
