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
    public int getMax(TreeNode cur, int count){
        if (cur == null) return count;

        int l = getMax(cur.left, count+1);
        int r = getMax(cur.right, count+1);

        
        
        return Math.max(l, r);
    }
    public int maxDepth(TreeNode root) {
        return getMax(root, 0);    
    }

}