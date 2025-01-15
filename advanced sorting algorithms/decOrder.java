public class decOrder {
    public static void mergeTwoSortedArrays(int[] a, int[] b, int[] arr){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < a.length && j < b.length){
            if(a[i] >= b[j]){
                arr[k] = a[i];
                i++;
                k++;
            }
            else{
                arr[k] = b[j];
                k++;
                j++;
            }
        }
        while(i < a.length){
            arr[k] = a[i];
            k++;
            i++;
        }
        while(j < b.length){
            arr[k] = b[j];
            k++;
            j++;
        }

    }
    public static void mergesort(int[] arr){
        if(arr.length == 1) return;
        int n = arr.length;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i = 0; i < a.length; i++){
            a[i] = arr[i];
        }
        for(int i = 0; i < b.length; i++){
            b[i] = arr[n/2+i];
        }
        mergesort(a);
        mergesort(b);
        mergeTwoSortedArrays(a,b,arr);
    }
    public static void main(String[] args) {
        int[] arr = {4,2,6,1,7,3,5,8};
        mergesort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
