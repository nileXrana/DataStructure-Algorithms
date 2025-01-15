public class oneSwap {
    public static void quicksort(int[] arr, int low, int high){
        int n = arr.length;
        int rdom = (high+low)/2;
        int count = 0;
        for(int i = low; i <= high; i++){
            if(arr[i] < arr[rdom]) count++;
        }
        int pivot = low+count;
        int temp = arr[rdom];
        arr[rdom] = arr[pivot];
        arr[pivot] = temp;
        
        int i = low;
        int j = high;
        while(i < pivot && j > pivot){
            if(arr[i] < arr[pivot]) i++;
            else if(arr[j] > arr[pivot]) j--;
            else{
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,8,6,7,5,9,10};
        quicksort(arr,0,arr.length-1);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
