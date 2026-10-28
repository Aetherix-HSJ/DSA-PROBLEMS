class Solution {
    public int knapsack(int W, int val[], int wt[]) {
      int n = wt.length;
      int [][] dp = new int[n+1][W+1];
      for(int i=0; i<=n; i++) dp[i][0] = 0;
      for(int j=0; j<=W; j++) dp[0][j] = 0;
      return solve(n,W, val, wt, dp);
    }
    public static int solve(int n, int W, int val[], int wt[], int[][] dp){
        for(int i=1; i<=n ; i++){
            for(int j=1; j<=W; j++){
                int a = 0;
                if(wt[i-1]<=j) a = val[i-1] + dp[i-1][j-wt[i-1]];
                int b = dp[i-1][j];
                dp[i][j] = Math.max(a,b);
            }
        }
        return dp[n][W];
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna