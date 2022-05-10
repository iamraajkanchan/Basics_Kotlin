package jetbrains_academy.collections

fun main() {
    val strings = readln().split(' ').toList()
    val string = readln()
    println(secondSolution(strings, string))
}

private fun secondSolution(strings: List<String>, str: String): Int {
    var occurrence = 0
    strings.forEach { value ->
        if (value == str) occurrence++
    }
    return occurrence
}