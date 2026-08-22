class Solution {
    static String[] ar = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public ArrayList<String> possibleWords(int[] arr) {
        if(arr.length==0) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
        // code here
        int ch = arr[0];
        int[] sub = new int[arr.length-1];
        for(int i=0; i<arr.length-1; i++){
            sub[i] = arr[i+1];
        }
        ArrayList<String> a =possibleWords(sub);
        ArrayList<String> b = new ArrayList<>();
        String s = ar[ch];

        if(s.length() == 0) {
            return a;
        }
        for(String ele: a){
            for(int i=0; i<s.length(); i++){
                b.add(s.charAt(i)+ele);
            }
        }
        return b;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna