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
    private val leaf1 = mutableListOf<Int>()
    private val leaf2 = mutableListOf<Int>()

    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        findLeaf(root1, leaf1)
        // println(leaf1)
        findLeaf(root2, leaf2)
        // println(leaf2)
        return leaf1 == leaf2
    }

    private fun findLeaf(root: TreeNode?, leafs: MutableList<Int>) {
        if (root == null) {
            return
        }
        if (root?.left == null && root?.right == null) {
            leafs.add(root.`val`)
        }
        findLeaf(root.left, leafs)
        findLeaf(root.right, leafs)
    }
}
