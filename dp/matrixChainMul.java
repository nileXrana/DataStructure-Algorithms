public class matrixChainMul {
    public static int mcm(int i, int j, int[][] arr, int[][] dp){
        if(i == j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int minCost = Integer.MAX_VALUE;
        for(int k = i; k < j; k++){ // partician
            int x = arr[i][0] * arr[j][1] * arr[k][1]; // v.v.v important
            int totalCost = mcm(i,k,arr,dp) + mcm(k+1,j,arr,dp) + x;
            minCost = Math.min(minCost,totalCost);
        }
        return dp[i][j] = minCost;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2},{2,3},{3,4}};
        int n = arr.length;
        int[][] dp = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(mcm(0,n-1,arr,dp));
    }
}
