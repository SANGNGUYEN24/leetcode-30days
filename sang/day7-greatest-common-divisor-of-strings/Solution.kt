class Solution {
    fun gcdOfStrings(str1: String, str2: String): String {
        if (str1 + str2 != str2 + str1) {
            return ""
        }

        var str1L = str1.length
        var str2L = str2.length

        while (str1L != str2L) {
            if (str1L > str2L) {
                str1L -= str2L
            } else {
                str2L -= str1L
            }
        }
        
        return str1.substring(0, str1L)
    }
}