class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0, max = Integer.MIN_VALUE;
        int i = 0, j=0;
        while(j<k){
            sum+=nums[j];
            j++;
        }
        max = Math.max(sum,max);
        while(j<nums.length){
            sum+=nums[j];
            sum-=nums[i];
            i++;
            j++;
            max = Math.max(max,sum);
        }
        return max/k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna