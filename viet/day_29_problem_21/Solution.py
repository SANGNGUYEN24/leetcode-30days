# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# class Solution:
#     def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
#         sorted_list = []
#         while list1 is not None and list2 is not None:
#             if list1.val <= list2.val:
#                 sorted_list.append(list1.val)
#                 list1 = list1.next
#             else:
#                 sorted_list.append(list2.val)
#                 list2 = list2.next
#         remain_list = list1 if list1 is not None else list2
#         while remain_list is not None:
#             sorted_list.append(remain_list.val)
#             remain_list = remain_list.next
#         return sorted_list

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode()
        cur = dummy

        while list1 and list2:
            if list1.val > list2.val:
                cur.next = list2
                list2 = list2.next
            else:
                cur.next = list1
                list1 = list1.next
            
            cur = cur.next
        
        if list1:
            cur.next = list1
        else:
            cur.next = list2
        
        return dummy.next