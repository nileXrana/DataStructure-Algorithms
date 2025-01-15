import java.util.*;

public class twoSumDuplicate {
    public static void main(String[] args) {
        // find element whose sum = 
        int[] arr = {0,0,4,1,6,3,2,6};
        int sum = 5;
        int i = 0;
        int j = arr.length - 1;
        int[] ans = new int [2];
        while(i < j){
            if(arr[i]+arr[j]==sum){
                ans[0] = arr[i];
                ans[1] = arr[j];
                for(int ele : ans){
                    System.out.print(ele+" ");
                }
                System.out.println();
                //removing dupicates(v.v.imp.)
                while(i < j && arr[i] == arr[i+1]) i++;
                while(i < j && arr[j] == arr[j-1]) j--;
                i++;
                j--;
            }
            else if(arr[i]+arr[j] > sum) j--;
            else i++;
        }
    
    }
}
