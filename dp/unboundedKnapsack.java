public class unboundedKnapsack {
    public static int profit(int i, int[] wt, int[] val, int C, int[][] dp){
        if(i == wt.length) return 0;
        if(dp[i][C] != -1) return dp[i][C];
        int skip = profit(i+1,wt,val,C,dp);
        if(C < wt[i]) return dp[i][C] = skip; // le hi nahi sakta
        int pick = val[i] + profit(i,wt,val,C-wt[i],dp);
        return dp[i][C] = Math.max(pick,skip);
    }
    public static void main(String[] args) {
        // given 
        int[] val = {5,3,7,16};
        int[] wt = {1,2,8,10}; 
        int C = 8;

        // dp
        int[][] dp = new int[wt.length][C+1];
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(profit(0,wt,val,C,dp));

    }
}
