import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter target element : ");
        int x = sc.nextInt();
        System.out.print("enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter array elements : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //solution
        boolean flag = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                flag = true;
                break;
            }
        }
        if(flag == true) System.out.println("target found");
        else System.out.println("target not found");




    }
}
