class Solution {
    public int[] canSeePersonsCount(int[] heights) {
       Stack<Integer> st = new Stack();
       int n = heights.length;
       int[] ans = new int[heights.length];
       ans[n-1] = 0;
       st.push(heights[n-1]);
       for(int i=n-2; i>=0; i--){
            int count = 0;
            while(st.size()>0 && heights[i]>st.peek()){
                st.pop();
                count++;
            }
            if(st.size()>0 && st.peek()>heights[i]) count++;
            st.push(heights[i]);
            ans[i] = count;
       }
       return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna