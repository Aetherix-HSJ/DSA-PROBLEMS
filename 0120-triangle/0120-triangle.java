class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> dp = new ArrayList<>();
        for (int i = 0; i < triangle.size(); i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(Integer.MIN_VALUE); 
            }
            dp.add(row);
        }
        return solve(triangle,0,0,dp);
    }
    public int solve(List<List<Integer>> triangle,int i, int j, List<List<Integer>>dp) {
        if(triangle.size()-1==i) return triangle.get(i).get(j);
        if(dp.get(i).get(j)!=Integer.MIN_VALUE) return dp.get(i).get(j);
        int top = solve(triangle,i+1,j,dp);
        int dig = solve(triangle,i+1,j+1,dp);
        int totalSum = triangle.get(i).get(j) + Math.min(top, dig);
        dp.get(i).set(j, totalSum);
        return dp.get(i).get(j);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna