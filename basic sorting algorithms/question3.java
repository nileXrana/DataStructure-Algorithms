public class question3 {
    public static void main(String[] args) {
        String[] arr = {"ade","ale","abc","ad"};
        int n = arr.length;
        // bubble sort
        boolean bool = true;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1 - i; j++){
                int ak = arr[j].compareTo(arr[j+1]);   // important
                if(ak > 0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    bool = false;
                }
            }
            if(bool == true) break;
        }
        for(String x : arr){
            System.out.print(x+" ");
        }
    }
}
