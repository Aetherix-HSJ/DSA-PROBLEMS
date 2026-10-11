class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0, j=0, maxSize = 0;
        while(j<s.length()){
           char c = s.charAt(j); 
           if(map.containsKey(c)){
                if(map.get(c)>=i){
                    i = map.get(c)+1;
                }
            }
           map.put(c,j);
           maxSize = Math.max(maxSize,j-i+1);
           j++;
        }
        return maxSize;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna