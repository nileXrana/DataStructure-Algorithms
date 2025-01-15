import java.util.Arrays;

public class sort_zeros_ones {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,0,0,1,0,0};
        //method 1
        // int zeros = 0;
        // int ones = 0;
        // int n = arr.length;
        // for(int i = 0; i < n; i++){
        //     if(arr[i] == 0) zeros++;
        //     else ones++;
        // }
        // for(int i = 0; i < n; i++){
        //     if(i < zeros) arr[i] = 0;
        //     else arr[i] = 1;
        // }

        // for(int ele : arr){
        //     System.out.print(ele+" ");
        // }

        //method 2 (one pass solution)
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while(i<j){
            if(arr[i] == 0) i++;
            else if(arr[j] == 1) j--;
            else if(i < j && arr[i] == 1 && arr[j] == 0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }




    }
}
