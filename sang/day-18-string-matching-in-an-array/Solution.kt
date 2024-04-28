class Solution {
    fun stringMatching(words: Array<String>): List<String> {
        var str = words.joinToString("-")
        val arr = ArrayList<String>()
        for (word in words) {
            val curr = str.replaceFirst(word, "")
            if (curr.contains(word)) arr.add(word)
        }
        return arr
    }
}