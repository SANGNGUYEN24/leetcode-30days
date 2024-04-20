class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }
        val charSet = mutableSetOf<Char>()
        var leftIdx = 0
        var result = 0

        for (rightIdx in 0 until s.length) {
            val char = s.get(rightIdx)
            while (charSet.contains(char)) {
                charSet.remove(s.get(leftIdx))
                // println("remove: ${s.get(leftIdx)}")
                leftIdx++
            }
            charSet.add(char)
            result = maxOf(result, charSet.size)
            // println(charSet)
        }
        return result
    }
}