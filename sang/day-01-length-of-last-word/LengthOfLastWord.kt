class LengthOfLastWord {
    fun lengthOfLastWord(s: String): Int {
        if (s.length == 0) {
            return 0
        }
        var result = 0
        var meetWord = false
        for (idx in (s.length - 1) downTo 0) {   
            if (s.get(idx) == ' ') {
                if (meetWord){
                    break
                }
                continue
            }
            meetWord = true
            result += 1
        }
        return result
    }
}