class Solution {
    fun removeDuplicateLetters(s: String): String {
        val seen = hashMapOf<Char, Boolean>()
        val frequency = hashMapOf<Char, Int>()
        val stack = mutableListOf<Char>()

        for (char in s) {
            seen[char] = false
            if (frequency.contains(char)) {
                frequency[char] = frequency[char]!! + 1
            } else {
                frequency[char] = 1
            }
        }

        // printDebug(seen, frequency, stack)
        
        // Add the first char in stack
        val charAt0 = s.get(0)
        stack.add(charAt0)
        frequency[charAt0] = frequency[charAt0]!! - 1
        seen[charAt0] = true

        // printDebug(seen, frequency, stack)

        // Keep increasing
        for (i in 1..s.length-1) {
            val char = s.get(i)
            // println(s.substring(0, i) + "[" + s.get(i) + "]" + s.substring(i + 1, s.length))
            // println("char = $char")
            var peek = stack.last()
            // println("peek = $peek")
            if (seen[char] == true) {
                frequency[char] = frequency[char]!! - 1
                // println("$char is presented in stack")
                // printDebug(seen, frequency, stack)
                continue
            }
            while (char < peek && frequency[peek]!! > 0) {
                if (stack.isEmpty()) {
                    break
                }
                // println("peek in loop = $peek")
                // println("frequency[$peek] = ${frequency[peek]}")
                val removedChar = stack.removeLast()
                // println("remove $removedChar")
                seen[removedChar] = false
                // printDebug(seen, frequency, stack)
                if (stack.isEmpty()) {
                    break
                }
                peek = stack.last()
            }
            stack.add(char)
            // println("add $char to stack")
            seen[char] = true
            frequency[char] = frequency[char]!! - 1
            // printDebug(seen, frequency, stack)
        }

        return stack.joinToString("")
    }

    private fun printDebug(seen: HashMap<Char, Boolean>, frequency: HashMap<Char, Int>, stack: List<Char>) {
        println("seen = $seen")
        println("frequency = $frequency")
        println("stack = $stack")
        println("----")
    }
}