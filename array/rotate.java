import java.util.Arrays;

class nilesh{
    void reverse(int[] arr, int a, int b){
        
        while(a <= b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
}

public class rotate {
    public static void main(String[] args) {
        nilesh ni = new nilesh();
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        int k = 1;
        int n = arr.length;
        if(k % n == 0){
            for(int x : arr){
                System.out.print(x+" ");
            }
        }
        else{
        ni.reverse(arr,0,n-k-1);
        ni.reverse(arr,n-k,n-1);
        ni.reverse(arr,0,n-1);
        for(int x : arr){
            System.out.print(x+" ");
        }
        }
        // can make code more optimise
    
    }
}