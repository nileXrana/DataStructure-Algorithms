//package java_code.basic sorting algorithms;
import java.util.*;
public class qesetion1 {
    public static void main(String[] args) {
        int[] arr = {54,11,28,47,91,63};
        int n = arr.length;
        int[] brr = new int[n];
        for(int i = 0; i < n; i++){
            brr[i] = arr[i];
        }
        Arrays.sort(brr);

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[j] == brr[i]) arr[j] = i;
            }
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
