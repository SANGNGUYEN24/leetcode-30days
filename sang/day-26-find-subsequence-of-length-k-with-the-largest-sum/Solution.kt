class Solution {
    fun maxSubsequence(nums: IntArray, k: Int): IntArray {
        return nums.mapIndexed{i, e -> Pair(i, e)}
            .sortedBy{-it.second}
            .take(k)
            .sortedBy{it.first}
            .map{nums[it.first]}
            .toIntArray()
    }
}
