class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[n+1][amount+1];
        for(int i=1; i<n+1; i++) dp[i][0] = 0;
        for(int j=0; j<amount+1; j++) dp[0][j] = Integer.MAX_VALUE -1;
        for(int j=0; j<amount+1; j++) {
            if(j%coins[0]==0) dp[1][j] = j/coins[0];
            else dp[1][j] = Integer.MAX_VALUE-1;
        }
        return solve(coins,amount, n, dp);
    }
    public int solve(int[] coins, int amount, int n, int[][] dp){
        for(int i=2; i<n+1; i++){
            for(int j=0; j<amount+1; j++){
                if(coins[i-1]<=j) dp[i][j] = Math.min(1+dp[i][j-coins[i-1]] , dp[i-1][j]);
                else dp[i][j] = dp[i-1][j];
            }
        }
        if(dp[n][amount]==Integer.MAX_VALUE-1) return -1;
        return dp[n][amount];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna