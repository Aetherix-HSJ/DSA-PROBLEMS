class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        // code here
        Stack<Integer> st2 = new Stack<>();
        while(st.size()>0){
            int top = st.pop();
            st2.push(top);
        }
        st2.push(x);
        while(st2.size()>0){
            int top1 = st2.pop();
            st.push(top1);
        }
        return st;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna