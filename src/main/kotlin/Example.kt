class Example {
    fun subtractAndLoopBack(number: Int): Int {
        val numStr = number.toString().toCharArray()
        val lastDigit = Character.getNumericValue(numStr[numStr.size - 1])

        val result = numStr.map { digitChar ->
            val digit = Character.getNumericValue(digitChar)
            if (digit < lastDigit) {
                9 - (lastDigit - digit)
            } else {
                digit - lastDigit
            }
        }.joinToString("").toInt()
        return result + lastDigit
    }

    fun rearrangeDigits(number: Int): Int {
        val numberString = number.toString()

        if (numberString.length != 6) {
            throw IllegalArgumentException("Input must be a six-digit number")
        }

        val first = numberString[4]
        val second = numberString[0]
        val third = numberString[1]
        val fourth = numberString[5]
        val fifth = numberString[3]
        val sixth = numberString[2]

        val rearrangedNumberString = "$first$second$third$fourth$fifth$sixth"

        return rearrangedNumberString.toInt()
    }

//    fun mappedDigits(number:Int): Int {
//
//    }
}