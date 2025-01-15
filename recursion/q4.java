public class q4 {
    public static void arrayRev(int[] arr, int n){
        if(n == 0) return; // base case
        System.out.print(arr[n-1]+" "); // work
        arrayRev(arr, n-1); // call
    }
    public static void main(String[] args) {
        int[] arr = {5,2,3,4,1};
        arrayRev(arr,arr.length);

    }
}
