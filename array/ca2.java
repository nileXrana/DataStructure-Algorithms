import java.util.Scanner;
public class ca2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1
        // System.out.print("enter number : ");
        // int n = sc.nextInt();
        // for(int i = 1; i <= n; i++){
        //     int sum = 0;
        //     for(int j = 1; j <= i; j++){
        //         if(i % j == 0) sum++;
        //     }
        //     if(sum == 5) System.out.print(i+" ");
        // }


        //2
        System.out.print("enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elements of array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0) sum++;
        }
        
        int[] brr = new int[sum];
        int a = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                brr[a] = arr[i];
                a++;
            }
        }
        
        int i = 0;
        int j = sum-1;
        while(i <= j){
            int temp = brr[i];
            brr[i] = brr[j];
            brr[j] = temp;
            i++;
            j--;
        }

        // for(int eme : brr){
        //     System.out.print(eme+" ");
        // }
        for(int ak = 0; ak < sum; ak++){
            System.out.print(brr[ak]+" ");
        }







    }
}
