public class sort0_1 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 0;
        arr[4] = 1;
        arr[5] = 0;
       
        
        int a = 0; 
        int b = arr.length - 1;
        while(a < b){
            if(arr[a] == 0) a++;
            if(arr[b] == 1) b--;
            if(a < b && arr[a] == 1 && arr[b] == 0){
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
            }
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }



    }
}
