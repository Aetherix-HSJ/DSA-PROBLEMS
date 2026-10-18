class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<n; i++) sum+=nums[i];
        if (sum < Math.abs(target) || (sum + target) % 2 != 0) return 0;
        int s1 = (sum+target)/2;
        int[][] dp = new int[n+1][s1+1];
        for(int i=0; i<n+1; i++){
            dp[i][0] = 1;
        }
        for(int j=1; j<s1+1; j++){
            dp[0][j] = 0;
        }
        return solve(nums,s1,n,dp);
    }
        public int solve(int[] nums, int s1, int n , int[][] dp){
            for(int i=1; i<n+1; i++){
                for(int j=0; j<s1+1; j++){
                    if(nums[i-1]<=j) dp[i][j] = (dp[i-1][j-nums[i-1]] + dp[i-1][j]);
                    else dp[i][j] = dp[i-1][j];
                }
            }
            return dp[n][s1];
        }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna