package jetbrains_academy.control_structures


fun main() {
    var numberOfPositiveNumbers = 0
    do {
        numberOfPositiveNumbers++
    } while (readln().toInt() > 0)
    println(numberOfPositiveNumbers)
}