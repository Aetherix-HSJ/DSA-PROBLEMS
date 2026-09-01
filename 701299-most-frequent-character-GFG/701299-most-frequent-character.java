class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
        }
        int max = Integer.MIN_VALUE;
        char ans = 'z';
        for(char ele: map.keySet()){
           if(map.get(ele) > max || (map.get(ele) == max && ele < ans)){
               max = map.get(ele);
               ans = ele;
           }

        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna