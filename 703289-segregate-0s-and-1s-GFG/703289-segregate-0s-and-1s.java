class Solution {
    void segregate0and1(int[] nums) {
        // code here
        int i = 0, j = nums.length-1;
        while(i<=j){
            if(nums[i]==0) i++;
            else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna