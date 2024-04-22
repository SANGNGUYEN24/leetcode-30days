class Solution {
    fun destCity(paths: List<List<String>>): String {
      val starts = mutableSetOf<String>()
      val ends = mutableSetOf<String>()
      for ((start, end) in paths) {
          starts.add(start)
          ends.add(end)
      }
      return ends.first { it !in starts }
    }
  }