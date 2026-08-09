class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] rev = reverse(nums);
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<rev.length; i++){
            st.push(rev[i]);
        }
        for(int i=0; i<rev.length; i++){
            while(st.size()!=0 && st.peek()<=rev[i]) st.pop();
            if(st.size()==0)ans[i]=-1;
            else ans[i] = st.peek();
            st.push(rev[i]);
        }
        return reverse(ans);
    }
  public int[] reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna