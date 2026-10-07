class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length()<=10){
            return new ArrayList<>();
        }
        HashSet<String> seen = new HashSet<>();
        HashSet<String> result = new HashSet<>();
        for(int i=0; i<=s.length()-10; i++){
            String a = s.substring(i,i+10);
            if(seen.contains(a)){
                result.add(a);
            }
            seen.add(a);
        }
        return new ArrayList<>(result);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna