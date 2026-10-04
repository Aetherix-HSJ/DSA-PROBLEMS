class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i=0, j=0;
        HashSet<Integer> set = new HashSet<>();
        while(j<=k && j<nums.length){
            if(set.contains(nums[j])) return true;
            set.add(nums[j]);
            j++;
        }
        while(j<nums.length){
            set.remove(nums[i]);
            if(set.contains(nums[j])) return true;
            set.add(nums[j]);
            i++;
            j++;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna