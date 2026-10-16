class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = wt.length;
        int[][] dp = new int[n+1][W+1];
        for(int i=0; i<n+1; i++){
            for(int j=0; j<W+1; j++){
            dp[i][j]=-1;
            }
        }
        return solve(W,val,wt,n,dp);
    }
     public int solve(int W, int val[], int wt[],int n,int[][] dp) {
        // code here
        if(n==0 || W==0) return 0;
        if(dp[n][W]!=-1) return dp[n][W];
        if(wt[n-1]<=W){
            int a = val[n-1]+solve(W-wt[n-1],val,wt,n-1,dp);
            int b = solve(W,val,wt,n-1,dp);
            dp[n][W] = Math.max(a,b);
            return Math.max(a,b);
        }
        else{
            dp[n][W] = solve(W,val,wt,n-1,dp);
            return solve(W,val,wt,n-1,dp);
        } 
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna