class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int i=0, j = arr.length-1;
        while(i<=j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
                i++;
            }
        }
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna