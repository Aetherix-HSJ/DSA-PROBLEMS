class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        int i = 0; int j = 0; int k =0;
        while(i!=m && j!=n){
            if(nums1[i]<=nums2[j]){
                ans[k] = nums1[i];
                i++;
                k++;
            }
            else if(nums1[i]>nums2[j]){
                ans[k] = nums2[j];
                j++;
                k++;
            }
        }
        if(i==m){
            while(j!=n){
            ans[k] = nums2[j];
            j++;
            k++;
            }
        }
        if(j==n){
            while(i!=m){
            ans[k] = nums1[i];
            i++;
            k++;
            }
        }
        for(int a= 0; a<ans.length; a++){
            nums1[a]= ans[a];
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna