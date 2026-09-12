class Solution {
    public int HR1(int[] nums, int[] dp, int i, int end){
        if(i>=end) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick = nums[i]+HR1(nums,dp,i+2,end);
        int drop = HR1(nums,dp,i+1,end);
        return dp[i] = Math.max(pick,drop);
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] dp = new int[nums.length+1];
        int[] dp2 = new int[nums.length+1];
        for(int i=0; i<dp.length; i++){
          dp[i] = -1;
          dp2[i] = -1;
        }
        int a = HR1(nums,dp,0,nums.length-1);
        int b = HR1(nums,dp2,1,nums.length);
        return Math.max(a,b);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna