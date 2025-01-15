public class arrayTravel {
    public static void printFrom(int n, int[] arr){
        if(n == arr.length) return; // base case
        System.out.print(arr[n]+" "); // work
        printFrom(n+1,arr); // call
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printFrom(0,arr);
    }
}
