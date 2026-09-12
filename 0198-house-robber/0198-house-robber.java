class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        for(int i=0; i<nums.length; i++){
            dp[i] = -1;
        }
        return solve(nums,dp,0);
    }
    public int solve(int[] nums, int[] dp, int i) {
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick = nums[i] + solve(nums,dp,i+2);
        int drop = solve(nums,dp,i+1);
        return dp[i] = Math.max(pick,drop);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna