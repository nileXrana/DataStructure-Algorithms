
public class mergeSort {
    public static void merge(int[] a, int[] b, int[] arr){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                arr[k] = a[i];
                k++;
                i++;
            }
            else{
                arr[k] = b[j];
                k++;
                j++;
            }
        }
        while(j < b.length){
            arr[k] = b[j];
            k++;
            j++;
        }
        while(i < a.length){
            arr[k] = a[i];
            k++;
            i++;
        }
    }
    public static void mergesort(int[] arr){
        if(arr.length == 1) return;
        int n = arr.length;
        // create two arrays
        int[] a = new int[n/2];
        int[] b = new int[n - n/2];
        // fill elements 
        for(int i = 0; i < a.length; i++){
            a[i] = arr[i];
        }
        for(int i = 0; i < b.length; i++){
            b[i] = arr[n/2 + i];
        }
        // recursion(magic)
        mergesort(a);
        mergesort(b);
        // send them to merge two sorted array
        merge(a,b,arr);
        // delete a and b to improve s.c.
        a = null;
        b = null;

    }
    public static void main(String[] args) {
        int[] arr = {1,4,2,7,3,6,5};
        mergesort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
