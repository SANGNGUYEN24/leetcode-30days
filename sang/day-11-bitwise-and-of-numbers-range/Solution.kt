class Solution {
    fun rangeBitwiseAnd(left: Int, right: Int): Int {
        var count = 0
        var l = left
        var r = right
        while(l != r) {
            l = l shr 1
            r = r shr 1
            count += 1
        }
        return l shl count
    }
}
