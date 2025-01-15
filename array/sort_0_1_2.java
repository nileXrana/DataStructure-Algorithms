public class sort_0_1_2 {
    public static void main(String[] args) {
        // method 1 
        int[] arr = {1,1,0,2,1,0,1,2,0,1,0};
        int n = arr.length;
        // int noofzeros = 0;
        // int noofones = 0; 
        
        // for(int i = 0; i < n; i++){
        //     if(arr[i] == 0) noofzeros++;
        //     else if(arr[i] == 1) noofones++;
            
        // }

        // for(int i = 0; i < n; i++){
        //     if(i < noofzeros) arr[i] = 0;
        //     else if(i < noofzeros + noofones) arr[i] = 1;
        //     else arr[i] = 2;
        // }

        // for(int ele : arr){
        //     System.out.print(ele+" ");
        // }


        //method 2 (dutch flag algorithm)
        int l = 0;
        int m = 0; 
        int h = n - 1;
        while(m <= h){
            if(arr[m] == 0){
                int temp = arr[l];
                arr[l] = arr[m];
                arr[m] = temp;
                l++;
                m++;
            }
            else if(arr[m] == 1){
                m++;
            }
            else{
                int temp = arr[m];
                arr[m] = arr[h];
                arr[h] = temp;
                h--;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }


    }
}
