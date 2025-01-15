public class next_greatest {
    public static void main(String[] args) {
        int[] arr = {12,8,50,37,2,49,16,28,21};
        int n = arr.length;
        int[] brr = new int[n];
        // for(int i = 0; i < n; i++){
        //     int max = Integer.MIN_VALUE;
        //     for(int j = i + 1; j < n; j++){
        //         max = Math.max(max,arr[j]);
        //     }
        //     brr[i] = max;
        // }
        // brr[n-1] = -1;
        // for(int ele : brr){
        //     System.out.print(ele+" ");
        // }      
        
        // method 2(optimised) 
        brr[n - 1] = -1;
        brr[n - 2] = arr[n - 1];
        int max = Integer.MIN_VALUE;
        for(int i = n - 1; i > 0; i--){
            max = Math.max(arr[i],max);
            brr[i-1] = max;
            
        }

        for(int each : brr){
            System.out.print(each+" ");
        }




    }
}
