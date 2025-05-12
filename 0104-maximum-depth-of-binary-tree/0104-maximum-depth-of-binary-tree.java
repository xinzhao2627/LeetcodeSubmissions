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
    public int dfs (int i, TreeNode root){
        if (root == null){
            return i;
        }
        return Math.max(Math.max(i,dfs(i+1, root.left)), Math.max(i, dfs(i+1, root.right)));
    }
    public int maxDepth(TreeNode root) {
        return dfs(0, root);
    }
}