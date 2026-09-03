class Solution {
    public int[] sortedSquares(int[] arr) {
       int[] ans = new int [arr.length];
       int i = 0, j = arr.length-1, k= ans.length-1;
       while(i<=j){
        if(Math.abs(arr[j])>=Math.abs(arr[i])){
            ans[k] = arr[j]*arr[j];
            j--;
            k--;
        } 
        else if(Math.abs(arr[j])<Math.abs(arr[i])){
              ans[k] = arr[i]*arr[i];
              i++;
              k--;
        }
       }
       return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna