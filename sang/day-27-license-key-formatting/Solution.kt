class Solution {
    fun licenseKeyFormatting(s: String, k: Int): String {
        val str = s.replace("-", "")
        val stringBuilder = StringBuilder()
        var count = 0
        println(str)
        for (i in str.length-1 downTo 0) {
            stringBuilder.append(str.get(i).uppercase())
            count++
            if (count == k && i != 0) {
                stringBuilder.append("-")
                count = 0
            }
        }
        return stringBuilder.toString().reversed()
    }
}