
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // code here
        if(a.length<b.length) return false;
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean ans = true;
        for(int ele: a){
            if(map.containsKey(ele)) map.put(ele,map.get(ele)+1);
            else map.put(ele,1);
        }
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int ele: b){
            if(map1.containsKey(ele)) map1.put(ele,map1.get(ele)+1);
            else map1.put(ele,1);
        }
        for(int ele: map1.keySet()){
            if(!map.containsKey(ele) ||map1.get(ele)>map.get(ele)) return false;
        }
        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna