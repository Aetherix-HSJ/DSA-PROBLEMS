class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i = 0; i<nums1.length; i++){
            for(int j = 0; j<nums2.length; j++){
                if(nums2[j]==nums1[i]){
                    int idx = j;
                    nums1[i] = -1;
                    for(int k = idx+1; k<nums2.length; k++){
                        if(nums2[k]>nums2[idx]){
                            nums1[i] = nums2[k];
                             break;
                        }
                    }
                    break;
                }
            }
        }
          return nums1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna