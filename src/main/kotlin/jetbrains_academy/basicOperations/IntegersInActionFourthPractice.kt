package jetbrains_academy.basicOperations

fun main() {
    val number = readln().toInt()
    val firstDigit = number.toString().first()
    println(firstDigit.toString().toInt())
}