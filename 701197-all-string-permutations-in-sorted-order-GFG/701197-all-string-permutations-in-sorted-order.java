class Solution {
    public ArrayList<String> permutation(String s) {
        // code here
        ArrayList<String> a =  permu(s,"");
        Collections.sort(a);
        return a;
}


public ArrayList<String> permu(String s, String asof) {
    ArrayList<String> ans = new ArrayList<>();
        if(s.length()==0) {
            ans.add(asof);
            return ans;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            String qlpart = s.substring(0,i);
            String qrpart = (s.substring(i+1));
            String roq = qlpart+qrpart;
            ArrayList<String> rans = permu(roq, asof+ch);
            ans.addAll(rans);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna