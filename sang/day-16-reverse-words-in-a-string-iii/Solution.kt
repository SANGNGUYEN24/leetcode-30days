class Solution {
    fun reverseWords(s: String): String {
        val words = s.split(" ")
        val result = StringBuilder()
        for (i in words.indices) {
            if (i != 0) {
                result.append(" ")    
            } 
            result.append(words[i].reversed())
        }
        return result.toString()
    }
}