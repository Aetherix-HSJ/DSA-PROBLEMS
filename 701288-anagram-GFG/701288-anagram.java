class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if (s1.length() != s2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (map.containsKey(ch)) map.put(ch, map.get(ch) + 1);
            else map.put(ch, 1);
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (map1.containsKey(ch)) map1.put(ch, map1.get(ch) + 1);
            else map1.put(ch, 1);
        }

        for (char ele : map1.keySet()) {
            if (!map.containsKey(ele)) return false;   // ✅ containsKey
            if (!map.get(ele).equals(map1.get(ele))) return false; // ✅ use equals()
        }

        return true;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna