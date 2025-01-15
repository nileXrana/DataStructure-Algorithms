public class quickSort {
    public static void quicksort(int[] arr, int low, int high){
        if(low >= high) return;
        //put low in its sorted position
        int count = 0;
        for(int i = low+1; i <= high; i++){
            if(arr[i] < arr[low]) count++;
        }
        int pivot = low+count;  // mindblowing for me
        int temp = arr[low];
        arr[low] = arr[pivot];
        arr[pivot] = temp;

        //put smalls at left and bigs at right
        int i = low;
        int j = high;
        while(i < pivot && j > pivot){
            if(arr[i] < arr[pivot]) i++;
            else if(arr[j] >= arr[pivot]) j--;
            else if(arr[i] >= arr[pivot] && arr[j] < arr[pivot]){
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
                i++;
                j--;
            }
        }
        // magic
        quicksort(arr,low,pivot-1);
        quicksort(arr,pivot+1,high);


    }
    public static void main(String[] args) {
        int[] arr = {4,9,7,1,2,3,6,5,8};
        quicksort(arr,0,arr.length-1);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
