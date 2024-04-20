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

    fun getMinimumDifference(root: TreeNode?): Int {
        var result = Int.MAX_VALUE
        // Sort the node values
        val listNode = mutableListOf<Int>()
        traverseInorder(root, listNode)
        // Find the minimum of two adjacent nodes
        for (i in 0..(listNode.size - 2)) {
           val diff = minOf(listNode[i + 1] - listNode[i])
           if (result > diff) {
            result = diff
           }
        }
        return result
    }

    fun traverseInorder(root: TreeNode?, listNode: MutableList<Int>) {
        if (root == null) {
            return
        }
        traverseInorder(root!!.left, listNode)
        listNode.add(root!!.`val`)
        traverseInorder(root!!.right, listNode)
    }
}