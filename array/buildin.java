import java.util.Scanner;
import java.util.Arrays;

public class buildin {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4};
        //for each loop
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        //1 sort
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //2 copy of array
        int[] brr = arr;   //shallow  copy(arr ko hi dusra nam mil gya brr)
        int[] crr = Arrays.copyOf(arr,arr.length);   //deep copy
        crr[0] = 6;
        for(int each : crr){
            System.out.print(each+" ");
        }
        System.out.println();
        int[] drr = new int[crr.length];
        for(int i = 0; i < crr.length; i++){
            drr[i] = crr[i];
        }
        for(int each : drr){
            System.out.print(each+" ");
        }
        

    }
}
