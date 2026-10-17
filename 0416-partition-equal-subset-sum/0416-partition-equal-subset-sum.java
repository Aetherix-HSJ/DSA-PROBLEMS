class Solution {
    public boolean canPartition(int[] nums) {
       int n = nums.length;
       int sum = 0; 
       for(int i=0; i<nums.length; i++){
        sum+=nums[i];
       }
       if(sum%2!=0) return false;
       else {
        boolean[][] dp = new boolean[n+1][(sum/2)+1];
         for(int i=0; i<n+1; i++){
           dp[i][0] = true;
           }
           for(int j=1; j<(sum/2)+1; j++){
            dp[0][j] = false;
           }
        return solve(nums,sum/2,n,dp) ;
       }
    }
    public boolean solve(int[] nums, int sum, int n, boolean[][] dp){
        for(int i=1; i<n+1; i++){
            for(int j=1; j<sum+1; j++){
                if(nums[i-1]<=j) dp[i][j] = (dp[i-1][j-nums[i-1]] || dp[i-1][j]);
                else dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna