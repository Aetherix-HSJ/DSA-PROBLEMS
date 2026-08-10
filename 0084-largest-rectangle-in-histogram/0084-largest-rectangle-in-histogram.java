class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> st = new Stack();
        int n = heights.length;
        int[] nse = new int[heights.length];
        st.push(new int[]{heights[n-1],n-1});
        nse[n-1] = n;
        for(int i =n-2; i>=0; i--){
             while(st.size()>0 && st.peek()[0]>=heights[i]){
                st.pop();
             }
             if(st.size()==0) nse[i] = n;
             else nse[i] = st.peek()[1];
             st.push(new int[]{heights[i],i});
        }
        while(st.size()!=0) st.pop();
        int[] pse = new int[heights.length];
        st.push(new int[]{heights[0],0});
        pse[0] = -1;
        for(int i =1; i<n; i++){
             while(st.size()>0 && st.peek()[0]>=heights[i]){
                st.pop();
             }
             if(st.size()==0) pse[i] = -1;
             else pse[i] = st.peek()[1];
             st.push(new int[]{heights[i],i});
        }
         int maxArea = 0;
        for(int i=0; i<pse.length; i++){
           int area = heights[i]*(nse[i]-pse[i]-1);
           maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna