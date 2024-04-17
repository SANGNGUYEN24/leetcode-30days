# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        head2 = None
        if head is None:
            return
        while head is not None:
            new_node = ListNode(head.val, head2)
            head2 = new_node
            head = head.next
        return head2
        