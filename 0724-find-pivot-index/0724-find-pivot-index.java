class Solution {
    public int pivotIndex(int[] arr) {
        int leftSum = 0; 
        int rightSum = 0;
        for(int i=0; i<arr.length; i++){
             rightSum+=arr[i];
        }
        for(int i=0; i<arr.length; i++){
                rightSum-=arr[i];
                if(rightSum==leftSum) return i;
                leftSum+=arr[i];
            }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna