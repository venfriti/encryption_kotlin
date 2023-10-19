fun main() {
    val example = Example()
    val unixTime = System.currentTimeMillis();
    val lastSixDigits = unixTime % 1000000
    val subtract = example.subtractAndLoopBack(lastSixDigits.toString())
    val rearrangedString = example.rearrangeDigits(subtract)
    val remappedString = example.mappedDigits(rearrangedString)
    println("Original Number: $lastSixDigits")
    println("Encrypted Number: $remappedString")
}