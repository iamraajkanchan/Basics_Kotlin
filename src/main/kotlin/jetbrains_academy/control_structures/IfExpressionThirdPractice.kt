package jetbrains_academy.control_structures

fun main() {
    val number = readln().toInt()
    println(
        if (number < 0) {
            "negative"
        } else if (number == 0) {
            "zero"
        } else {
            "positive"
        }
    )
}