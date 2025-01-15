import java.util.Scanner;

public class largest_element {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{2,5,0},{3,3,3}};
        int mx = arr[0][0];
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                mx = Math.max(mx,arr[i][j]);
            }
        }
        System.out.println(mx);
    }
}
