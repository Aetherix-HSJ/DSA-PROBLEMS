class Solution {
    public int maxSubarraySum(int[] nums, int k) {
        // Code here
        int i=0, j =0, sum=0;
        while(j<k){
            sum+=nums[j];
            j++;
        }
        int max = 0;
        max = Math.max(max,sum);
        while(j<nums.length){
            sum = sum - nums[i] + nums[j];
            max = Math.max(max,sum);
            i++;
            j++;
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna