class Solution {
    public boolean validPalindrome(String s) {
        int i= 0, j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return (Palindrome(s,i+1,j) || Palindrome(s,i,j-1));
            i++;
            j--;
        }
        return true;
    }
    public boolean Palindrome(String s, int i, int j) {
        s = s.toLowerCase();
        while(i<=j){
            while(!Character.isLetterOrDigit(s.charAt(i))) i++;
            while(!Character.isLetterOrDigit(s.charAt(j))) j--;
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