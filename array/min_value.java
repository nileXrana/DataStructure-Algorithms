import java.util.Scanner;

public class min_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter elements of array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //solution
        int ak = arr[0];
        for(int i = 1; i < arr.length; i++){
            ak = Math.min(ak,arr[i]);
        }
        System.out.println("minimum value of array is : "+ak);
    }
}
