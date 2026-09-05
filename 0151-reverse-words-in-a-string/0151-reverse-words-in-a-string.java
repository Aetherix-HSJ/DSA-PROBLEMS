class Solution {
    static void reverse(int i, int j, StringBuilder SB){
        while(i<=j){
            char temp = SB.charAt(i);
            SB.setCharAt(i,SB.charAt(j));
            SB.setCharAt(j,temp);
            i++;
            j--;
        }
    }
    public String reverseWords(String s) {
        int l = 0, r = s.length()-1;
        while(l<s.length()){
            if(s.charAt(l)==' ') l++;
            else break;
        }
        while(r>=0){
            if(s.charAt(r)==' ') r--;
            else break;
        }

        StringBuilder SB = new StringBuilder();
        while(l<=r){
              if(s.charAt(l)!=' '){
                SB.append(s.charAt(l));
                l++;
              }
              else if(s.charAt(l)==' '){
                if(s.charAt(l-1)!=' ') SB.append(s.charAt(l));
                l++;
              }
        }
        // reverse StringBuilder
        int i = 0, j = SB.length()-1;
        reverse(i,j,SB);
        //reverse words
        i = 0; j=0;
        while(i<SB.length()){
            while(j<SB.length() && SB.charAt(j)!=' ') {
                j++;
            }
            reverse(i,j-1,SB);
                i = j+1;
                j = i;
        }
        return SB.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna