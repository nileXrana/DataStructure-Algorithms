import java.util.*;
public class twoSum {
    public static void main(String[] args) {
        int[] ans = new int[2];
        int[] arr = {0,2,4,1,6,3}; //no duplicate elements
        int sum = 5;
        // (if we have to find the index)
        // simple loops
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = i+1; j < arr.length; j++){
        //         if(arr[i] + arr[j] == sum){
        //             ans[0] = arr[i];
        //             ans[1] = arr[j];
        //             for(int ele : ans){
        //                 System.out.print(ele+" ");
        //             }
        //             System.out.println();
        //         }
        //     }
        // }

        // (if we have to find the element)
        // two pointer(important)
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            if(arr[i]+arr[j]>sum) j--;
            else if(arr[i]+arr[j]<sum) i++;
            else{
                ans[0] = arr[i];
                ans[1] = arr[j];
                for(int ele : ans){
                    System.out.print(ele+" ");
                }
                System.out.println();
                i++;
                j--;
            }
        }




    }
}
