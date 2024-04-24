# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def pairSum(self, head: Optional[ListNode]) -> int:
        listize = []
        while head is not None:
            listize.append(head.val)
            head = head.next
        n = len(listize)
        chunk_list2 = listize[n//2:]
        chunk_list2.reverse()
        listize = listize[0:n//2]
        max_ = -1
        for i in range(len(listize)):
            if listize[i] + chunk_list2[i] > max_:
                max_ = listize[i] + chunk_list2[i]
        return max_
        