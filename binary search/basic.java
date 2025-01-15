class basic{
    public static void main(String[] args) {
        int[] arr = {10,15,21,34,81,105,180,500,614}; // sorted
        int target = 180;
        int low = 0;
        int high = arr.length - 1;
        boolean bool = false;
        while(low <= high){
            int mid = (low + high) / 2 ;
            if(arr[mid] > target){
                high = mid - 1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                bool = true;
                break;
            }
        }
        if(bool == true) System.out.println("target found");
        else System.out.println("target not found");
    }

}