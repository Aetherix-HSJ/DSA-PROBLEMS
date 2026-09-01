class Solution {
    public int findPairs(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count =0;
        for(int ele: arr){
            if(map.containsKey(ele)) map.put(ele,map.get(ele)+1);
            else map.put(ele,1);
        }
        for(int ele : map.keySet()){
            if (k == 0) {
                if (map.get(ele) > 1)
                    count++;
            } 
            else{
            int a = ele + k;
            if(map.containsKey(a)) count++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna