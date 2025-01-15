import java.util.Scanner;
public class q5 {
    public static int index(int[] arr, int a, int ele){
        if(arr[a] == ele) return a;
        int ans = index(arr, a+1, ele);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        int ans = index(arr,0,a);
        System.out.print("Index of "+a+" is : ");
        System.out.println(ans);
    }
}
