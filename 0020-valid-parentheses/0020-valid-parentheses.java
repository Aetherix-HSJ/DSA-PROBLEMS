class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
            }
            else{
                if(st.size()==0) return false;
                char top = st.peek();
                if (SameStyle(top,ch)) st.pop();
                else return false;
            }
        }
        return (st.size()==0);
    }
    public boolean SameStyle(char top,char ch){
        if(top=='(' && ch == ')') return true;
        if(top=='[' && ch==']') return true;
        if(top=='{'&&ch=='}') return true;
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna