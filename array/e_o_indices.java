public class e_o_indices {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                arr[i] = arr[i] + 10;
            }
            else arr[i] = arr[i] * 2;
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
