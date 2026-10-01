class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int i=0, j=0;
       double sum = 0, avg = 0, maxAvg=Integer.MIN_VALUE;
       while(j<k){
           sum+=nums[j];
           j++;
       }
       avg = sum/k;
       maxAvg = Math.max(avg,maxAvg);
       while(j<nums.length){
        sum = sum+nums[j]-nums[i];
        avg = sum/k;
        maxAvg = Math.max(avg,maxAvg);
        i++;
        j++;
       }
       return maxAvg;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna