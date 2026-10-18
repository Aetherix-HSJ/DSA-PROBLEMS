class Solution {
    static int perfectSum(int[] arr, int target) {
        // code here
        int n = arr.length;
        int[][] dp = new int[n+1][target+1];
        for(int i=0; i<n+1; i++){
            dp[i][0] = 1;
        }
        for(int j=1; j<target+1; j++){
            dp[0][j] = 0;
        }
        return solve(arr, target, n , dp);
    }
    static int solve(int[] arr, int target, int n , int[][] dp){
        for(int i=1; i<n+1; i++){
            for(int j=0; j<target+1; j++){
                if(arr[i-1]<=j) dp[i][j] =(dp[i-1][j-arr[i-1]]+dp[i-1][j]);
                else dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][target];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna