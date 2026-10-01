class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=0, j=0;
        int duplicate =0;
        while(j<nums.length && j<=k){
           if(map.containsKey(nums[j])) map.put(nums[j],map.get(nums[j])+1);
           else map.put(nums[j],1);
           if(map.get(nums[j])>1) duplicate++;
           j++;
        }
        if(duplicate>=1) return true;
        while(j<nums.length){
           if(map.containsKey(nums[j])) map.put(nums[j],map.get(nums[j])+1);
           else map.put(nums[j],1);
           if(map.get(nums[j])>1) duplicate++;
           if(map.get(nums[i])>1) duplicate--;
           if(map.containsKey(nums[i])) map.put(nums[i],map.get(nums[i])-1);
           i++;
           j++;
           if(duplicate>=1) return true; 
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna