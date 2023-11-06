
val trick: () -> Unit = {
    println("Do like 2 tricks")
}

val treat: () -> Unit = {
    println("Have like 3 treats")
}

val extraTreat : (Int) -> String = {
    "I have being tricked like $it times"
}

val cupcake : (Int) -> String = {
    "Have a cupcake!"
}

fun trickOrTreat(isTrick: Boolean, extraTreats: (Int) -> String) : () -> Unit {
    return if (isTrick){
        trick
    } else {
        println(extraTreats(5))
        treat
    }
}

fun main(){
    val trickFunction = trickOrTreat(false) { "$it quarters" }
    val treatFunction = trickOrTreat(true, cupcake)

    trickFunction()
    repeat(4) {
        treatFunction()
    }
}