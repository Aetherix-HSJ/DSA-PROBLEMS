class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        Queue<Integer> q2 = new LinkedList<>();
        int mid = q.size()/2;
        for(int i=0; i<mid; i++){
            q2.add(q.remove());
        }
        while(q2.size()>0){
            q.add(q2.remove());
            q.add(q.remove());
        }
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna