class Solution {
    public int great(int[] arr, int l){
        int maxEle = arr[l];
        for(int i=l; i<arr.length; i++){
           if(arr[i]>maxEle) maxEle = arr[i];
        }
        return maxEle;
    }
    public int[] replaceElements(int[] arr) {
        for(int j=0; j<arr.length-1; j++){
            arr[j] = great(arr,j+1);
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna