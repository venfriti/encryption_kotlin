class Example {
    fun subtractAndLoopBack(number: String): String {
        val numStr = number.toCharArray()
        val lastDigit = Character.getNumericValue(numStr[numStr.size - 1])

        val result = numStr.map { digitChar ->
            val digit = Character.getNumericValue(digitChar)
            if (digit < lastDigit) {
                9 - (lastDigit - digit)
            } else {
                digit - lastDigit
            }
        }.joinToString("").toInt()
        val resultString = (result + lastDigit).toString()
        return if (resultString.length == 6){
            resultString
        } else {
            "0$resultString"
        }
    }

    fun rearrangeDigits(number: String): String {
        if (number.length != 6) {
            throw IllegalArgumentException("Input must be a six-digit number")
        }
        var numbered = ""
        numbered += number[4]
        numbered += number[0]
        numbered += number[1]
        numbered += number[5]
        numbered += number[3]
        numbered += number[2]

        return numbered
    }

    fun mappedDigits(number: String): String{
        var mapped = ""
        val numberMap = mapOf(
            0 to 4,
            1 to 3,
            2 to 9,
            3 to 6,
            4 to 2,
            5 to 8,
            6 to 1,
            7 to 5,
            8 to 7,
            9 to 0
        )

        for (i in 0..5){
            val checker = numberMap[number[i].digitToInt()]
            mapped += checker.toString()
        }
        return mapped
    }
}