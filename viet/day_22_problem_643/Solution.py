class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        # if len(nums) == 1:
        #     return nums[0]
        curr_avg = max_avg = sum(nums[:k])

        for i in range(k, len(nums)):
            curr_avg += nums[i] - nums[i - k]
            max_avg = max(max_avg, curr_avg)

        return max_avg / k