class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length-1;
        while(i<j){
            int sum = numbers[i]+numbers[j];
            if(sum<target) i++;
            else if(sum>target) j--;
            else return new int[]{i+1,j+1};
        }
        return new int[]{-1,-1};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna