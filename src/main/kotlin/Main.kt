fun main() {
    val example = Example()
    val unixTime = System.currentTimeMillis();
    val lastSixDigits = unixTime % 1000000
    val subtract = example.subtractAndLoopBack("123456")
    val rearrangedString = example.rearrangeDigits("123456")
    val remappedString = example.mappedDigits(rearrangedString)
    println("Subtracted Number: $subtract")
    println("Original Number: $lastSixDigits")
    println("Encrypted Number: $remappedString")
}