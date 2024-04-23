class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        non_nums1 = []
        non_nums2 = []
        for i in nums1:
            if i not in nums2 and i not in non_nums1:
                non_nums1.append(i)
        for i in nums2:
            if i not in nums1 and i not in non_nums2:
                non_nums2.append(i)
        return [non_nums1, non_nums2]
        