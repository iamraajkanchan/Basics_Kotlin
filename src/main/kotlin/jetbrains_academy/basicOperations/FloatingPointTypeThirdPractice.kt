package jetbrains_academy.basicOperations

const val CONVERSION_MUL_DIFFERENCE = 1.8
const val CONVERSION_DIFFERENCE = 32
fun main() {
    val celsius = readln().toDouble()
    val fahrenheit = celsius * CONVERSION_MUL_DIFFERENCE + CONVERSION_DIFFERENCE
    println(fahrenheit)
}