//package java_code.basic sorting algorithms;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,4,5,1,2};
        int n = arr.length;
        // bubble sort 1
        // for(int x = 0; x < n - 1; x++){
        //     for(int i = 0; i <= n - 2; i++){
        //         if(arr[i] > arr[i+1]){
        //             int temp = arr[i];
        //             arr[i] = arr[i+1];
        //             arr[i+1] = temp;
        //         }
        //     }
        // }

        // bubble sort 2
        for(int x = 0; x < n - 1; x++){
            for(int i = 0; i <= n - 2 - x; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        // bubble sort 3
        
        boolean bool = true;
        for(int x = 0; x < n - 1; x++){
            for(int i = 0; i <= n - 2 - x; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    bool = false;
                } 
            }
            //after each pass check : agar 1 bhi bar swap nahi hua to bool true hi rahega
            if(bool == true) break; 
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }

    }
}
