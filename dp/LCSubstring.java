public class LCSubstring {
    public static void main(String[] args) {
        String a = "abac";
        String b = "cab";
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m+1][n+1];
        int mx = Integer.MIN_VALUE;
        for(int i = 1; i < m+1; i++){
            for(int j = 1; j < n+1; j++){
                if(a.charAt(i-1) == b.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = 0;
                mx = Math.max(mx,dp[i][j]);
            }
        }
        System.out.println(mx);
    }
}
