class Solution {

    static int countWays(int n) {
        // add your code here
        int[] dp = new int[n+1];
        if(n==0 || n==1) return 1;
        if(n==2) return 2;
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        return solve(n, dp);
    }
    static int solve(int n, int[] dp){
        for(int i=3; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna