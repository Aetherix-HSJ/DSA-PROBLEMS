class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=0; i<=text1.length(); i++){
            for(int j=0; j<=text2.length(); j++){
                dp[i][j] = -1;
            }
        }
        return solve(text1, text2, text1.length()-1, text2.length()-1, dp);
    }
    public int solve(String text1, String text2, int i, int j,int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(text1.charAt(i)==text2.charAt(j)) return dp[i][j] = 1+solve(text1, text2, i-1,j-1,dp);
        else return dp[i][j] = Math.max(solve(text1, text2, i-1, j,dp),solve(text1, text2, i, j-1,dp));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna