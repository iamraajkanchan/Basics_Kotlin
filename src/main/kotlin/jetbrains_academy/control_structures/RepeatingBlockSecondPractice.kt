package jetbrains_academy.control_structures

fun main() {
    val numbersInSequence = readln().toInt()
    var positiveNumbers = 0
    repeat(numbersInSequence) {
        val number = readln().toInt()
        when {
            number > 0 -> positiveNumbers++
        }
    }
    println(positiveNumbers)
}