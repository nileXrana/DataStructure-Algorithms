import java.util.Scanner;

public class basic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,2,6,3,4,5,3,5,4,433,};
        System.out.println(arr.length);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }


        sc.close();
    }
}
