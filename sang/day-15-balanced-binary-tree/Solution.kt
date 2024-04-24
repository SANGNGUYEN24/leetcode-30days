/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
        return getHeight(root) != -1
    }

    fun getHeight(root: TreeNode?): Int {
        // println("${root?.`val`}")
        if (root == null) {
            return 0
        }

        val leftHeight = getHeight(root.left)
        val rightHeight = getHeight(root.right)

        if (leftHeight == -1 || rightHeight == -1) {
            return -1
        }
        if (abs(leftHeight - rightHeight) > 1) {
            return -1
        }

        return maxOf(leftHeight, rightHeight) + 1
    }
}