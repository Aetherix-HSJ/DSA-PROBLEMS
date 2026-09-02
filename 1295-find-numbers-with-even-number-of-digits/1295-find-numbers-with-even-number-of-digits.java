class Solution {
    public int findNumbers(int[] arr) {
        int evencount = 0;
        for(int i=0; i<arr.length; i++){
             int n = arr[i];
             int count = 0;
             while(n!=0){
                n = n/10;
                count++;
             }
             if(count%2==0) evencount++;
             count = 0;
        }
        return evencount;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna