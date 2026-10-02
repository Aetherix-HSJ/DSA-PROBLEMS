class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length()<=10){
            return new ArrayList<>();
        }
        HashSet<Integer> seen = new HashSet<>();
        HashSet<String> result = new HashSet<>();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A',0);
        map.put('C',1);
        map.put('G',2);
        map.put('T',3);
        int rep = 0;
        int k = 10;
        //AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT
        for(int i=0; i<k; i++){
           int pow = k-i-1; 
           rep= rep+((int)Math.pow(4,pow)*map.get(s.charAt(i)));
        }
        seen.add(rep);
        for(int i=k; i<s.length(); i++){
            rep= rep-((int)Math.pow(4,k-1)*map.get(s.charAt(i-k)));
            rep = 4*rep;
            rep = rep + map.get(s.charAt(i));
            if(seen.contains(rep)){
                result.add(s.substring(i-k+1,i+1));
            }
            seen.add(rep);
        }
        return new ArrayList<String>(result);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna