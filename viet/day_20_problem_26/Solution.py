class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        d = dict()
        for i in nums:
            d[i] = 0
        for i in nums:
            d[i] += 1
        i = 0
        count = 0
        for j in d.keys():
            nums[i] = j
            i += 1
            count += 1
        return count