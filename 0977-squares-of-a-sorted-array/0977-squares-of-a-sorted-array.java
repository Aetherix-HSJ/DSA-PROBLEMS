class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int i =0, j = nums.length-1, k = nums.length-1;
        while(i<=j){
           if(Math.abs(nums[i])>Math.abs(nums[j])){
            ans[k] = nums[i]*nums[i];
            i++;
            k--;
           }
           else if(Math.abs(nums[j])>=Math.abs(nums[i])){
            ans[k] = nums[j]*nums[j];
            j--;
            k--;
           }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna