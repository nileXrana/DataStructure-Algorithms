import java.util.Scanner;
public class rollNo_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];
        int m = arr.length;
        int n = arr[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int ele[] : arr){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }

    }
}
