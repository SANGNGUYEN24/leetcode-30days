class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        a = [1] * len(nums)
        for i in range(len(nums) - 2, -1, -1):
            a[i] = nums[i + 1] * a[i + 1]
        b = 1
        for j in range(1, len(nums)):
            b *= nums[j - 1]
            a[j] *= b
        return a