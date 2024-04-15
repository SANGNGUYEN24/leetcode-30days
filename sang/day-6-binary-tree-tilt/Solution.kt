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
class Solution {`
    private var sum = 0

    fun findTilt(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        postOrder(root)
        return sum
    }

    fun postOrder(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        val leftSum = postOrder(root!!.left)
        val rightSum = postOrder(root!!.right)
        sum += Math.abs(leftSum - rightSum)
        // println("node: ${root!!.`val`}, leftSum = $leftSum, rightSum = $rightSum")
        return leftSum + rightSum + root!!.`val`
    }
}