class Solution {
    public int countPartitions(int[] arr, int diff) {
        // code here
        int n = arr.length; 
        int range = 0;
        for(int i=0; i<arr.length; i++){
            range+=arr[i];
        }
        if (range < diff || (range + diff) % 2 != 0) return 0;
        int s1 = (range + diff) / 2;
        int [][] dp = new int[n+1][s1+1];
        for(int i=0; i<n+1; i++) dp[i][0] = 1;
        for(int j=1; j<s1+1; j++) dp[0][j] = 0;
        return subsetSum(arr, s1, dp, n);
        
    }
    public int  subsetSum(int[] arr, int s1, int[][]dp, int n){
        for(int i=1; i<n+1; i++){
            for(int j=0; j<=s1; j++){
                if(arr[i-1]<=j) dp[i][j] = (dp[i-1][j-arr[i-1]] + dp[i-1][j]);
                else dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][s1];
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna