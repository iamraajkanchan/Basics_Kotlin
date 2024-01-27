package jetbrains_academy.basicOperations

const val NUMBER_OF_INPUTS = 4
fun main() {
    // This is an example of deconstruction
    val (a, b, c, d) = List(NUMBER_OF_INPUTS) { readln().toDouble() }
    println(a * 10.5 + b * 4.4 + (c + d) / 2.2)
}