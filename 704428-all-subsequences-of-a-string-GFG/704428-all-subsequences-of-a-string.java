import java.util.*;
class Solution {
    public List<String>powerSet(String s) {
        // Code here
        List<String> c = sub(s);
        Collections.sort(c);
        return c;
    }
    static List<String> sub(String s){
        if(s.length()==0) {
            List<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
        char ch = s.charAt(0);
        String s1 = s.substring(1);
        List<String> a = sub(s1);
        List<String> b = new ArrayList<>();
        for(String ele: a) b.add(""+ele);
        for(String ele: a) b.add(ch+ele);
        return b;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna