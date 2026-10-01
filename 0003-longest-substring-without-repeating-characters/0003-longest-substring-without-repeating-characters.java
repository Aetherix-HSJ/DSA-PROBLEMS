class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i=0, j=0, maxSize = 0;
        while(j<s.length()){
           char c = s.charAt(j);
           while(set.contains(c)){
               set.remove(s.charAt(i));
               i++;
           }
           set.add(c);
           maxSize = Math.max(maxSize,j-i+1);
           j++;
        }
        return maxSize;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna