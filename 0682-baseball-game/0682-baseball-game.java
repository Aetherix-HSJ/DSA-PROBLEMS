class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack();
        for(int i=0; i< operations.length; i++){
            if(operations[i].equals("C")) st.pop();
            else if(operations[i].equals("+")) {
               int a = st.peek()-0;
               st.pop();
               int b = st.peek()-0;
               st.push(a);
               st.push(a+b);
            }
            else if(operations[i].equals("D")){
                int t = st.peek();
                t = t*2;
                st.push(t);
            }
            else st.push(Integer.parseInt(operations[i]));
        }
        int sum = 0;
        while(st.size()>0){
            int top = st.pop();
            sum = sum+top;
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna