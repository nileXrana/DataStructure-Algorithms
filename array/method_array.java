import java.util.Scanner;

public class method_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        change(arr);
        System.out.println(arr[4]);
    }

    public static void change(int[] arr) {
        arr[4] = 10;
    }
}
