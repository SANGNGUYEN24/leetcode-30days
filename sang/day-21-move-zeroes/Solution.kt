class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var i = 0
        for (idx in nums.indices) {
            if (nums[idx] == 0) {
                i = idx
                break
            }
        }
        var j = i + 1
        while (j <= nums.size - 1) {
            if (nums[i] == 0 && nums[j] != 0) {
                val temp = nums[j]
                nums[j] = nums[i]
                nums[i] = temp
                i++
            }
            j++
        }
    }
}