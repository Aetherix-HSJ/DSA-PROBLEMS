class Solution {
    public int lengthOfLIS(int[] nums) {
       List<Integer> list = new ArrayList<>();
       for(int i=0; i<nums.length; i++){
        if(list.isEmpty()) list.add(nums[i]);
        if(list.get(list.size()-1)<nums[i]) list.add(nums[i]);
        else{
            int high = list.size()-1;
            int low = 0;
            while(low<=high){
                int mid = low+(high-low)/2;
                if(list.get(mid)>=nums[i]) high = mid-1;
                else low = mid+1;
            }
            list.set(high+1,nums[i]);
        }
       }
       return list.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna