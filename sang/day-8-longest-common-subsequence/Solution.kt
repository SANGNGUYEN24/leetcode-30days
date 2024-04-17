class Solution {
    fun longestCommonSubsequence(text1: String, text2: String): Int {
        // Creat a table
        val text1L = text1.length
        val text2L = text2.length
        val table = Array(text1L + 1) { IntArray(text2L + 1) { 0 } }
        for (i in 1..text1L) {
            for (j in 1..text2L) {
                if (text1.get(i - 1) == text2.get(j - 1)) {
                    table[i][j] = 1 + table[i-1][j-1]
                } else {
                    table[i][j] = maxOf(table[i-1][j], table[i][j-1])
                }
                // print("${table[i][j]} ")
            }
            // println()
        }
        return table[text1L][text2L]
    }
}