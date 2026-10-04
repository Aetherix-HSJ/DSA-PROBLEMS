class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0, j=0, sum = 0, minSize = Integer.MAX_VALUE;
        while(j<nums.length){
            sum += nums[j];
            while(sum>=target){
                minSize = Math.min(minSize,j-i+1);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        if(minSize==Integer.MAX_VALUE) return 0;
        return minSize;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna