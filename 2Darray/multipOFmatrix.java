import java.util.*;
public class multipOFmatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};  // 2 * 3
        int[][] brr = {{1,1,1},{2,2,2},{3,3,3}};  // 3 * 3 
        // resultant matrix will be of 2 * 3
        int[][] crr = new int[arr.length][brr[0].length];
        for(int i = 0; i < crr.length; i++){
            for(int j = 0; j < crr[0].length; j++){
                for(int k = 0; k < arr[0].length; k++){
                    crr[i][j] += arr[i][k] * brr[k][j];
                }
            }
        }
        for(int i = 0; i < crr.length; i++){
            for(int j = 0; j < crr[0].length; j++){
                System.out.print(crr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
