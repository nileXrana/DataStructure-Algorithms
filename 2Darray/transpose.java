import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{4,5},{7,8}};
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] trans = new int[n][m];
        for(int j = 0; j < n; j++){   //column wala loop
            for(int i = 0; i < m; i++){     //row wala loop
                trans[j][i] = arr[i][j];
            }
        }
        for(int[] ele : trans){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }

    }
}
