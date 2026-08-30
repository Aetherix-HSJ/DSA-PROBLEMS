class MyStack {
    Queue<Integer> q = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        int n = q.size();
        for(int i=0; i<n-1; i++){
            q.add(q.remove());
        }
        int t= q.remove();
        // q.add(t);
        return t;
    }
    
    public int top() {
        int n = q.size();
        for(int i=0; i<n-1; i++){
            q.add(q.remove());
        }
        int t = q.peek();
        q.add(q.remove());
        return t;
    }
    
    public boolean empty() {
        return (q.size()==0);
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna