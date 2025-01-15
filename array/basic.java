import java.util.Scanner;
class akak{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //declaring an array
        System.out.print("enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        //initialising indivisually
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;
        // arr[3] = 40;
        // arr[4] = 50;

        //initialising by input
        for(int i = 0; i <= n-1; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i <= n-1; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}