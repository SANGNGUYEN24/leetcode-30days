class Solution {
    fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
        if (coordinates.size == 2) {
            return true
        }
        var allPointOnAxis = true
        val firstPoint = coordinates[0]
        val secondPoint = coordinates[1]

        // All points on x-axis
        for (point in coordinates) {
            if (point[0] != firstPoint[0]) {
                allPointOnAxis = false
                break
            }
        }
        
        if (allPointOnAxis) {
            return true
        }

        for (point in coordinates) {
            if (point[1] != firstPoint[1]) {
                allPointOnAxis = false
                break
            }
        }

        if (allPointOnAxis) {
            return true
        }

        // y1 = ax1 + b
        // b = y1 - ax1
        // y2 = ax2 + b
        // y2 = ax2 + y1 - ax1 = a(x2 - x1) + y1
        val a = (secondPoint[1].toDouble() - firstPoint[1]) / (secondPoint[0] - firstPoint[0])
        for (i in (2..coordinates.size - 1)) {
            val point = coordinates[i]
            // y2 = a(x2 - x1) + y1
            val checkLine = point[1] - a*(point[0] - firstPoint[0]) - firstPoint[1]
            if (checkLine != 0.0) {
                return false
            }
        }
        return true;
    }
}