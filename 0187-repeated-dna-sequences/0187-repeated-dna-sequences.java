
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if (s.length() < 10) return new ArrayList<>();

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('C', 1);
        map.put('G', 2);
        map.put('T', 3);

        HashSet<Integer> seen = new HashSet<>();
        HashSet<String> result = new HashSet<>();

        int i = 0, j = 0, sum = 0;

        // Calculate hash of the first window of size 10
        while (j < 10) {
            int a = map.get(s.charAt(j));
            int pow = 10 - j - 1;
            sum = sum + a * (int) Math.pow(4, pow);
            j++;
        }

        seen.add(sum);

        // Slide the window
        while (j < s.length()) {
            sum = 4 * (sum - ((int) Math.pow(4, 9) * map.get(s.charAt(i))))
                    + map.get(s.charAt(j));

            i++;

            if (seen.contains(sum)) {
                result.add(s.substring(i, j + 1));
            }

            seen.add(sum);
            j++;
        }

        return new ArrayList<>(result);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna