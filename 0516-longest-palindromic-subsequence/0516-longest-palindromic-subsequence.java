class Solution {
    public int longestPalindromeSubseq(String s) {
        String s1 = s;
        String s2 = new StringBuilder(s1).reverse().toString();
        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) dp[i][0] = 0;
        for (int j = 0; j <= m; j++) dp[0][j] = 0;

        return solve(s1, s2, n, m, dp);
    }
    public int solve(String text1, String text2, int i, int j, int[][] dp) {
        for (int p = 1; p <= i; p++) {
            for (int q = 1; q <= j; q++) {
                if (text1.charAt(p - 1) == text2.charAt(q - 1))
                    dp[p][q] = 1 + dp[p - 1][q - 1];
                else
                    dp[p][q] = Math.max(dp[p - 1][q], dp[p][q - 1]);
            }
        }
        return dp[i][j];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna