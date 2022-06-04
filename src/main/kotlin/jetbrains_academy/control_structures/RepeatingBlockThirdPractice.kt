package jetbrains_academy.control_structures

fun main() {
    val numbersInSequence = readln().toInt()
    var maximumNumber = 0
    repeat(numbersInSequence) {
        val number = readln().toInt()
        if (number < 1000 && number % 4 == 0 && number > maximumNumber) {
            maximumNumber = number
        }
    }
    println(maximumNumber)
}