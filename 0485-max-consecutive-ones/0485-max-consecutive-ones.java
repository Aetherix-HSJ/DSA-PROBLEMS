class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxcount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) {
                count=0;
            }
            else{
                count++;
                if(count>maxcount) maxcount = count;
            }
        }
        return maxcount;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna