class Solution {
    public int lengthOfLIS(int[] nums) {
      int dp[][] = new int[nums.length+1][nums.length+2];
       for(int i=0; i<=nums.length; i++){
        for(int j=0; j<=nums.length+1; j++){
            dp[i][j] = -1 ;
        }
       }
       return solve(0,-1,nums,dp); 
    }
    public int solve(int i, int p, int[] arr, int[][] dp){
        if(i>=arr.length) return 0;
        int a = 0;
        if(dp[i][p+1]!=-1) return dp[i][p+1];
        if(p==-1 || arr[i]>arr[p]){
           a = 1 + solve(i+1,i,arr,dp);
        } 
        int b = solve(i+1,p,arr,dp);
        
        return dp[i][p+1] = Math.max(a,b);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna