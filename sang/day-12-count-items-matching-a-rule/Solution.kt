class Solution {
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
        var count = 0
        var key = when(ruleKey) {
            "type" -> 0
            "color" -> 1
            "name" -> 2
            else -> 0
        }
        items.forEach { item ->
            if (item[key] == ruleValue) {
                count++
            }
        }
        return count
    }
}