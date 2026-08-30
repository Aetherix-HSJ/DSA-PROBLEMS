class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
       //Using stack
       Stack<Integer> st = new Stack<>();
       int n = q.size();
       int mid = q.size()/2;
       for(int i=0; i<mid; i++){
           st.push(q.remove());
       }
       while(st.size()>0) q.add(st.pop());
       for(int i=0; i<mid; i++){
           st.push(q.remove());
       }
       while(st.size()>0){
           q.add(st.pop());
           q.add(q.remove());
       } 
       for(int i=0; i<n; i++){
           st.push(q.remove());
       }
        while(st.size()>0) q.add(st.pop());
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna