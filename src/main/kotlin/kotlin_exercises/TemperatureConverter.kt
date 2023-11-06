package kotlin_exercises

class TemperatureConverter {

}
fun main() {
    printFinalTemperature(5.0, "Celsius", "Fahrenheit", celsiusToF)
    printFinalTemperature(298.15, "Kelvin", "Celsius", kelvinToC)
}

val celsiusToF : (Double) -> Double = {
    ((9.0/5.0) * it)+ 32
}

val kelvinToC : (Double) -> Double = {
    it - 273.15
}

val fahrenheitToK : (Double) -> Double = {
    (((it - 32) * (5.0/9.0)) + 273.15)
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
//Complete the main() function so that it calls the printFinalTemperature() function and prints the following lines. You need to pass arguments for the temperature and conversion formula. Hint: you may want to use Double values to avoid Integer truncation during division operations.
//
//27.0 degrees Celsius is 80.60 degrees Fahrenheit.
//350.0 degrees Kelvin is 76.85 degrees Celsius.
//10.0 degrees Fahrenheit is 260.93 degrees Kelvin.
//Back