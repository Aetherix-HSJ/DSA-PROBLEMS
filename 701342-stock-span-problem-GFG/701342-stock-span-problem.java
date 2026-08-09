class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {

        Stack<int[]> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            int span = 1;

            while (!st.isEmpty() && st.peek()[0] <= arr[i]) {
                span += st.pop()[1];
            }

            st.push(new int[]{arr[i], span});
            ans.add(span);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna