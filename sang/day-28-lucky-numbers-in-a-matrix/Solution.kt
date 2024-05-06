class Solution {
    fun luckyNumbers (matrix: Array<IntArray>): List<Int> {
        if (matrix.size == 0) {
            return emptyList()
        }
        val minInRow = matrix.map { it.min() ?: 0}
        val maxInColumn = matrix[0].mapIndexed { 
            index, _ -> 
            val column = matrix.map { it[index] }
            column.max() ?: 0
        }
        return minInRow.intersect(maxInColumn).toList()
    }
}
