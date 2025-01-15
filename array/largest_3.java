public class largest_3 {
    public static void main(String[] args) {
        int[] arr = {2,4,1,5,2,10};
        int n = arr.length;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] >= arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print(arr[n-3]+" "+arr[n-2]+" "+arr[n-1]);
        
    }
}
