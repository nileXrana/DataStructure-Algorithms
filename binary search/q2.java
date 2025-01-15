public class q2 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1};
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int lb = n;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == 1){
                lb = Math.min(lb,mid);
                high = mid - 1;
            }
            else low = mid + 1;
        }
        System.out.println(n-lb);
    }
}
