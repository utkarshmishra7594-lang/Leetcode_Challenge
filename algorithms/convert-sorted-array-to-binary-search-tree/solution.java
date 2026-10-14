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
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildBST(int[] nums, int left, int right) {
        // base case
        if (left > right) return null;

        // mid element root banega
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        // left subtree
        root.left = buildBST(nums, left, mid - 1);

        // right subtree
        root.right = buildBST(nums, mid + 1, right);

        return root;
    }
}
