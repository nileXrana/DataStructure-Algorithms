import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        int m = nums.length;
        int n = nums[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                sum += nums[i][j];
            }
        }
        System.out.println(sum);
    }
}
