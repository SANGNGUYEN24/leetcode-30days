class Solution {
    fun makeSmallestPalindrome(s: String): String {
        val array = CharArray(s.length)
        for (i in 0..(s.length-1)) {
            val char1 = s.get(i)
            val char2 = s.get(s.length - 1 - i)
            if (char1 <= char2) {
                array[i] = char1
                array[s.length - 1 - i] = char1
            } else {
                array[i] = char2
                array[s.length - 1 - i] = char2
            }
        }
        val stringBuilder = StringBuilder()
        array.forEach {
            stringBuilder.append(it)
        }
        return stringBuilder.toString()
    }
}