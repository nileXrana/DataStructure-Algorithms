public class merge_arrays {
    public static void main(String[] args) {
        int[] a = {3,5,7};
        int[] b = {2,4,6,8};
        int n = a.length + b.length;
        int[] c = new int[n];
        // for(int i = 0; i < n; i++){
        //     if(i < o) crr[i] = arr[i];
        //     else crr[i] = brr[i - o];
        // }

        // for(int ele : crr){
        //     System.out.print(ele+" ");
        // }
        // for(int i = 0; i < n; i++){
        //     for(int j = i + 1; j < n; j++){
        //         if(crr[i] > crr[j]){
        //             int temp = crr[i];
        //             crr[i] = crr[j];
        //             crr[j] = temp;
        //         }
        //     }
        // }
        // System.out.println();
        // for(int ele : crr){
        //     System.out.print(ele+" ");
        // }



        // 3pointer (method 2)

        int i = a.length - 1;
        int j = b.length - 1;
        int k = c.length - 1;
        while(i >= 0 && j >= 0){ // now no index out of bond issue
            if(i >= j){
                c[k] = a[i];
                i--;
                k--;
            }
            else{
                c[k] = b[j];
                j--;
                k--;
            }
        }

        if(i < 0){
            while(j >= 0){
                c[k] = b[j];
                j--;
                k--;
            }
        }
        else{
            while(i >= 0){
                c[k] = a[i];
                i--;
                k--;
            }
        }
        

        for(int x : c){
            System.out.print(x+" ");
        }






    }
}
