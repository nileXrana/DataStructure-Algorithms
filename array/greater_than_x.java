public class greater_than_x {
    public static void main(String[] args) {
        int[] arr = {6,2,13,4,5,7,9};
        int x = 5;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > x) sum += arr[i];
        }
        System.out.println(sum);
    }
}
