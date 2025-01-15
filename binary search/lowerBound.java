public class lowerBound {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 15, 15, 20, 25, 40};
        int target = 2;
        int lb = arr.length;
        if(target > arr[arr.length - 1]) lb = arr.length; 
        else if(target < arr[0]) lb = 0;
        else{
            int low = 0;
            int high = arr.length - 1;
            while(low <= high){
                int mid = (high - low) / 2 + low;
                if(arr[mid] >= target){  //possibility
                    lb = Math.min(lb,mid);
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        
        System.out.println(lb);

    }
}
