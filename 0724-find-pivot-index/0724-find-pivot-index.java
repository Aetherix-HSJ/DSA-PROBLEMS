class Solution {
    public int pivotIndex(int[] nums) {
        int Lsum = 0;
        int Rsum = 0;
        for(int i=0; i<nums.length; i++){
            Rsum+=nums[i];
        }
        int i =0;
        while(i<nums.length){
            Rsum-=nums[i];
            if(Rsum==Lsum) return i;
            Lsum+=nums[i];
            i++;
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna