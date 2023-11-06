fun main() {
    val example = Example()
    val unixTime = System.currentTimeMillis()
    val lastSixDigits = unixTime % 100000000
    val stringValue = lastSixDigits.toString()
    val removeTwo = stringValue.substring(0, stringValue.length - 2)

    val subtract = example.ethicalSubtraction(removeTwo)
    val rearrangedString = example.rearrangeDigits(subtract)
    val remappedString = example.mappedDigits(rearrangedString)
    println("Original Number: $removeTwo")
    println("Encrypted Number: $remappedString")

}