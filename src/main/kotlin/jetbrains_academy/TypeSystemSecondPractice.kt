package jetbrains_academy

fun main() {
    val input: String = readLine()!!
    println(isNumber(input))
}

fun isNumber(input: String): Any {
    return input.toIntOrNull() ?: input
}