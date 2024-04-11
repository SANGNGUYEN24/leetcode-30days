class ConstructRectangle {
    fun constructRectangle(area: Int): IntArray {
        val sq = Math.sqrt(area.toDouble()).toInt()
        var height = sq
        while (area % height != 0) {
            height += 1
        }
        val width = area / height;
        if (width > height) {
            return intArrayOf(width, height)
        }
        return intArrayOf(height, width)
    }
}