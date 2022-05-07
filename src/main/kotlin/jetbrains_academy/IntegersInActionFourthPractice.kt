package jetbrains_academy

fun main() {
    val number = readln().toInt()
    val firstDigit = number.toString().first()
    println(firstDigit.toString().toInt())
}