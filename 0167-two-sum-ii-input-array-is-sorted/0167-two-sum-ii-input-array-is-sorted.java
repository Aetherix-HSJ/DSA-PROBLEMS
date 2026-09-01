class Solution {
    public int[] twoSum(int[] arr, int target) {
        int i = 0; int j = arr.length-1;
        while(i<=j){
             if(arr[i]+arr[j]==target) return new int[]{i+1,j+1};
             else if(arr[i]+arr[j]>target) j--;
             else i++;
        }
        return new int[]{-1,-1};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna