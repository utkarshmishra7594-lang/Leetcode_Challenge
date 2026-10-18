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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // base case
        if (root == null) {
            return new TreeNode(val);
        }

        // left side
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        }
        // right side
        else {
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }
}
