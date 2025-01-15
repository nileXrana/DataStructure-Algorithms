public class assignmentQ4 {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{3,4,7,8},{1,4,12,3}};
        int m = arr.length;
        int n = arr[0].length;
        int[] ans = new int[m];
        for(int i = 0; i < m; i++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                sum += arr[i][j];
            }
            ans[i] = sum;
        }
        for(int i = 0; i < m; i++){
            int ak = 0;
            for(int j = 0; j < m; j++){
                if(ans[i] >= ans[j]) ak++;
            }
            if(ak == m){
                System.out.println(i + 1);
                break;
            }
        }

    }
}
