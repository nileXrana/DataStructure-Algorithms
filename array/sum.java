
public class sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,10,10};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("the sum of array is : "+sum);
    }
}
