/* Structure of Binary Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    // Constructor
    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    public ArrayList<Integer> levelOrder(Node root) {
        ArrayList<Integer>ans = new ArrayList<>();
        // code here
        if(root==null) return ans;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int size = q.size();
            for(int i=0; i<size; i++){
                Node n = q.remove();
                ans.add(n.data);
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna