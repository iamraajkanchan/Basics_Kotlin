package jetbrains_academy

fun main() {
    val number = readLine()?.toInt()!!
    val character = readLine()?.first()
    println(number.toChar() == character)
}