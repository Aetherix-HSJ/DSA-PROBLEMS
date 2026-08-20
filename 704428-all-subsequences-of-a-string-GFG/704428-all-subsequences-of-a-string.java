import java.util.*;
class Solution {
    public List<String>powerSet(String s) {
        // Code here
        List<String> b = sub(s);
        Collections.sort(b);
        return b;
    }
    static List<String> sub(String s){
        if(s.length()==0){
            List<String> rest = new ArrayList<>();
            rest.add("");
            return rest;
        }
        char ch = s.charAt(0);
        List<String> a = sub(s.substring(1));
        List<String> ans = new ArrayList<>();
        for(String ele: a){
            ans.add(""+ele);
        }
        for(String ele: a){
            ans.add(ch+ele);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna