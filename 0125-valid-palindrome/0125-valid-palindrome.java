class Solution {
    public boolean isPalindrome(String s) {
      s= s.replaceAll("[^a-zA-Z0-9]", "");  
      s = s.toLowerCase();
      int i = 0, j = s.length()-1;
      while(i<j){
        if(s.charAt(i)!=s.charAt(j)) return false;
        i++;
        j--;
      }
      return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna