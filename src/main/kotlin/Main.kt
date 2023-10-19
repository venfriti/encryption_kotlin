fun main(args: Array<String>) {
    val example = Example()
    val sixDigitNumber = 623456 // Replace with your desired input number
    val subtract = example.subtractAndLoopBack(sixDigitNumber)
    val rearrangedString = example.rearrangeDigits(subtract)
    val remappedString = example.mappedDigits(rearrangedString)
    println("Original Number: $sixDigitNumber")
    println("Encrypted Number: $remappedString")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}