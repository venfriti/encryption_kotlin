class Example {
    fun ethicalSubtraction(number: String): String{
        var sixDigits = number
        while(sixDigits.length != 6){
            sixDigits = "0$sixDigits"
        }
        val lastDigit = sixDigits[5].digitToInt()
        var subtracted = ""
        for (i in 0..4){
            val currentNum = sixDigits[i].digitToInt()
            subtracted += if (lastDigit > currentNum){
                val subtraction = 10 + currentNum - lastDigit
                subtraction
            } else {
                val subtraction = currentNum - lastDigit
                subtraction
            }
        }
        subtracted += lastDigit
        return subtracted
    }

    fun rearrangeDigits(number: String): String {
        val numberList = listOf(4, 0, 1, 5, 3, 2)
        var numbered = ""
        for (i in numberList){
            numbered += number[i]
        }
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