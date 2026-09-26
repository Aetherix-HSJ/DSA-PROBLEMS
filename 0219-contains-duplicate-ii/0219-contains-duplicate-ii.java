class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    HashSet<Integer> set = new HashSet<>();
    int i =0, j =0;
    while(j<Math.min(k,nums.length)){
        if(set.contains(nums[j])) return true;
        set.add(nums[j]);
        j++;
    }
    while(j<nums.length){
        if(set.contains(nums[j])) return true;
        set.add(nums[j]);
        set.remove(nums[i]);
        j++;
        i++;
    }
    return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna