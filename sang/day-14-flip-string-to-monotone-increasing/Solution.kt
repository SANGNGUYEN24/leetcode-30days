class Solution {
    fun minFlipsMonoIncr(s: String): Int {
        var result = 0
        var countOnes = 0
        for (char in s) {
            if (char == '1') {
                countOnes += 1
            } else {
                result = minOf(result + 1, countOnes)
            }
        }
        return result
    }
}