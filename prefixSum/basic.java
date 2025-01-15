
public class basic {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i = 1; i < arr.length; i++){
            arr[i] += arr[i-1];
        }
        // prefix sum : 1,3,6,10,15
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // suffix sum : 35 34 31 25 15
        for(int i = arr.length - 2; i >= 0; i--){
            arr[i] += arr[i+1];
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
