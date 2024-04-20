class NumberComplement {
    fun findComplement(num: Int): Int {
        return converBinaryToDecimal(convertDecimalToBinary(num).reversed())
    }

    fun convertDecimalToBinary(num: Int): String {
        var dNum = num
        var bNum = ""
        while (dNum / 2 != 0) {
            bNum = (dNum % 2).toString() + bNum
            dNum = dNum / 2
        }
        bNum = (dNum % 2).toString() + bNum
        return bNum
    }

    fun converBinaryToDecimal(bNum: String): Int {
        var complement = StringBuilder()
        var dNum = 0.0
        for (char in bNum) {
            val newChar = if (char == '1') '0' else '1'
            complement.append(newChar)
        }
        val complementStr = complement.toString()

        for (i in (complementStr.length - 1) downTo 0) {
            val digit = complementStr.get(i)
            if (digit == '0') {
                continue
            }
            dNum += Math.pow(2.0, i.toDouble())
        }
        return dNum.toInt()
    }
}