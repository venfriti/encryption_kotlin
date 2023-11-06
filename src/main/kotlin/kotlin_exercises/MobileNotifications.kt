package kotlin_exercises

class MobileNotifications {}
fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = false

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    val result = if (age < 13) {
        15
    } else if (age < 61) {
        if (isMonday){
            20
        } else{
            25
        }
    } else if (age < 101) {
        20
    } else {
        -1
    }
    return result
}