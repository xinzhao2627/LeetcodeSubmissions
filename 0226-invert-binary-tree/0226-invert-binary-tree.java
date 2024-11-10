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
    // public TreeNode swapper(TreeNode)

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;

        invertTree(root.right);
        invertTree(root.left);

        return root;
    }
}