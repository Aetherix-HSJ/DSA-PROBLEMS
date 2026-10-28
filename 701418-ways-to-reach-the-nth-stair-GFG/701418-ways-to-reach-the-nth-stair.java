class Solution {
    public int countWays(int n) {
        // code here
        int[] dp = new int[n+1];
        for(int i=0; i<=n; i++) dp[i] = -1;
        return solve(n,dp);
    }
    public int solve(int n, int[] dp){
        if(n==0) return 1; 
        if(n==1) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = solve(n-1,dp)+solve(n-2,dp);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna