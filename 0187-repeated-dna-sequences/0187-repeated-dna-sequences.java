class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> seen = new HashSet<>();
        HashSet<String> result = new HashSet<>();
        int i =0, j=10;
        if (s.length() < 10) {
            return new ArrayList<>();
        }
        StringBuilder sb = new StringBuilder(s.substring(0,10));
        while(j<s.length()){
            String dna = sb.toString();
            if(seen.contains(dna)){
                result.add(dna);
            }
            seen.add(dna);
            sb.append(s.charAt(j));
            sb.deleteCharAt(0);
            j++;
        }
        String dna = sb.toString();

        if (seen.contains(dna)) {
            result.add(dna);
        }
        return new ArrayList<String>(result);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna