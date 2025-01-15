public class q1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,4,4,5};
        int x = 4;
        // concept : upper bound
        int low = 0;
        int high = arr.length - 1;
        int ub = arr.length;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] > x){
                ub = Math.min(ub,mid);
                high = mid - 1;
            }
            else low = mid + 1;
        }
        System.out.println(ub-1);
    }
}
