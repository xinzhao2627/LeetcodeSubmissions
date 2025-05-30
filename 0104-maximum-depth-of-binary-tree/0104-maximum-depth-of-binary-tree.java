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
        int a = dfs(i+1, root.left);
        int b = dfs(i+1, root.right);

        return Math.max(a, b);
    }
    public int maxDepth(TreeNode root) {
        return dfs(0, root);
    }
}