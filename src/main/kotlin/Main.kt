fun main(args: Array<String>) {
    val example = Example()
    val sixDigitNumber = 123405 // Replace with your desired input number
    val subtract = example.subtractAndLoopBack(sixDigitNumber)
    val rearrange = example.rearrangeDigits(sixDigitNumber)
    val rearrangedSubtract = example.rearrangeDigits(subtract)
    println("Original Number: $sixDigitNumber")
    println("New Number: $subtract")
    println("Rearranged Number: $rearrange")
    println("Encrypted Number: $rearrangedSubtract")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}