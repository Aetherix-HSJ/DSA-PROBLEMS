class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int i = 0, j = 0;
        long sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int duplicate = 0;
        while (j < k) {
            if (map.containsKey(nums[j])) {
                map.put(nums[j], map.get(nums[j]) + 1);
            } else {
                map.put(nums[j], 1);
            }
            sum += nums[j];
            if(map.get(nums[j])>1) duplicate++;
            j++;
        }
        long max = Integer.MIN_VALUE;
        if (duplicate ==0)
            max = Math.max(max, sum);
        while (j < nums.length) {
            if (map.containsKey(nums[j])){
                map.put(nums[j], map.get(nums[j]) + 1);
            }
            else
                map.put(nums[j], 1);   
            if(map.get(nums[j])>1) duplicate++;    
            sum = sum + nums[j]; 
            if(map.get(nums[i])>1) duplicate--;
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) - 1);
            }
            else
                map.put(nums[i], 1);
            sum = sum - nums[i];     
            if (duplicate==0)
                 max = Math.max(sum, max);     
            i++;
            j++;     
        }
        if (max == Integer.MIN_VALUE)
            return 0;
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna