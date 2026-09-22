class Solution {
     String reverse(String s){
        char[] chars = s.toCharArray();
        int i =0, j = chars.length-1;
        while(i<j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
    public int longestPalindromeSubseq(String s) {
        String a = s; 
        String b = reverse(s);
        int[][] dp = new int[a.length()+1][b.length()+1];
        for(int i = 0; i<dp.length; i++){
            for(int j = 0; j<dp.length; j++){
                dp[i][j] = -1;
            }
        }
        return helper(a, b , a.length(), b.length() ,dp);
    }
    public int helper(String a, String b , int i, int j , int[][] dp){
        if(i==0 || j==0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i-1)==b.charAt(j-1)) { 
            dp[i][j] = 1 + helper(a,b,i-1,j-1,dp);
            return dp[i][j];
        }
        else{
            int c = helper(a,b,i-1,j,dp);
            int d = helper(a,b,i,j-1,dp);
            dp[i][j] = Math.max(c,d);
            return dp[i][j];
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna