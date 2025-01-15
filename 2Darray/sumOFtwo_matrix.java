import java.util.Scanner;

public class sumOFtwo_matrix {
    public static void main(String[] args) {
        int[][] nums1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] nums2 = {{1,1,1},{2,2,2},{3,3,3}};
        int m = nums1.length;
        int n = nums1[0].length;
        int[][] result = new int[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                result[i][j] = nums1[i][j] + nums2[i][j];
            }
        }

        for(int[] ele : result){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }

        
    }
}
