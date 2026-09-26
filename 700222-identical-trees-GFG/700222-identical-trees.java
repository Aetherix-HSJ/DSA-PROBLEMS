/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    public boolean isIdentical(Node r1, Node r2) {
        // code here
        if(r1==null && r2==null) return true;
        if(r1==null || r2==null) return false;
        if(r1.data!=r2.data) return false;
        if(!isIdentical(r1.left,r2.left)) return false;
        if(!isIdentical(r1.right,r2.right)) return false;
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna