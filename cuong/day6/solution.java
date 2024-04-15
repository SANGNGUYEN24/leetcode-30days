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
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return sumNumbersRootToLeaves(root, 0);
    }

    private int sumNumbersRootToLeaves(TreeNode node, int val) {

        if (node == null) {
            return 0;
        }
        int sum;
        if (node.left == null && node.right == null) {
            return val * 10 + node.val;
        }

        int left = sumNumbersRootToLeaves(node.left, val * 10 + node.val);
        int right = sumNumbersRootToLeaves(node.right, val * 10 + node.val);

        return left + right;
    }
}