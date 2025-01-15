import java.util.Arrays;
import java.util.Scanner;
public class two_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array length : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("enter elements of array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the number : ");
        int sum = sc.nextInt();

        // solution
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] == sum - arr[i]){
                    System.out.print(i+","+j);
                    System.out.println();
                }
            }
        }








    }
}
