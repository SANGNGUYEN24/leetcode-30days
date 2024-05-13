/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        val size = findSize(head)
        // println(size)

        if (size == 0) {
            return null
        }

        val middleIdx = size / 2
        var currentIdx = 0
        var currentNode = head

        while (currentNode != null) {
            if (currentIdx == middleIdx) {
                return currentNode
            }
            currentNode = currentNode.next
            currentIdx++
        }
        return null
    }

    fun findSize(head: ListNode?): Int {
        var size = 0
        var currentNode = head
        while (currentNode != null) {
            size++
            currentNode = currentNode.next
        }
        return size
    }
}