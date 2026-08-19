class Solution {
    public static int largest(int[] arr) {
        // code here
      return lar(arr,arr.length-1,Integer.MIN_VALUE);
}
    static int lar(int[] arr, int n,int max){
        if(n==-1) return max;
        max = lar(arr,n-1,max);
        if(arr[n]>max) max = arr[n];
        return max;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna