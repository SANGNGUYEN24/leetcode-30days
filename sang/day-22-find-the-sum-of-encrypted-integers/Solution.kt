class Solution {
    fun sumOfEncryptedInt(nums: IntArray): Int {
        var sum = 0
        for (num in nums) {
            var numStr = num.toString()
            val length = numStr.length
            var maxChar = Char.MIN_VALUE
            for (digit in numStr) {
                if (maxChar < digit) {
                    maxChar = digit
                }
            }
            sum += maxChar.toString().toInt() * "1".repeat(length).toInt()
        }
        return sum
    }
}