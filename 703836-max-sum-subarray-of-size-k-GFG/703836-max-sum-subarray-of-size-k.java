class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int i = 0, j = 0;
        int sum = 0;
        while(j<k){
            sum+=arr[j];
            j++;
        }
        int max = 0;
        max = Math.max(sum,max);
        while(j<arr.length){
            sum = sum+arr[j]-arr[i];
            i++;
            j++;
            max = Math.max(max,sum);
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna