public class merge_array {
    public static void main(String[] args) {
        int[] arr = {1,3,9};
        int[] brr = {4,5,6,12};
        int m = arr.length;
        int n = brr.length;

        int[] crr = new int[m+n];
        int i = 0; // arr
        int j = 0; // brr
        int k = 0; // crr
        while(i < m && j < n){
            if(arr[i] <= brr[j]){
                crr[k] = arr[i];
                i++;
                k++;
            }
            else{
                crr[k] = brr[j];
                j++;
                k++;
            }
        }
        if(i == m){
            while(j < n){
                crr[k] = brr[j];
                j++;
                k++;
            }
        }
        else{
            while(i < m){
                crr[k] = arr[i];
                i++;
                k++;
            }
        }
        for(int x : crr){
            System.out.print(x+" ");
        }

    }
}
