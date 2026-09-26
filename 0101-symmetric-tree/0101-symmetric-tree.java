/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        TreeNode l = invert(root.left);
        TreeNode r = root.right;
        return isSame(l,r);
    }
    public TreeNode invert(TreeNode r) {
        if(r==null) return null;
        invert(r.left);
        invert(r.right);
        TreeNode temp = r.left;
        r.left = r.right;
        r.right = temp;
        return r;
    }
    public boolean isSame(TreeNode l, TreeNode r){
        if(l==null && r==null) return true;
        if(l==null || r==null) return false;
        if(l.val!=r.val) return false;
        return (isSame(l.left,r.left) && isSame(l.right,r.right));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna