class Solution {
    static String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) {
            List<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
        char ch = digits.charAt(0);
        String sub = digits.substring(1);
        List<String> a = letterCombinations(sub);
        List<String> b = new ArrayList<>();
        int index = ch-'0';
        String c = arr[index];
        for(String ele: a) {
           for(int i=0; i<c.length(); i++){
            b.add(c.charAt(i)+ele);
           }
        }
        return b;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna