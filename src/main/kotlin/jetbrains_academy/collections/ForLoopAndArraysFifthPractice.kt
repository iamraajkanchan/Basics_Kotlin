package jetbrains_academy.collections

fun main() {
    val size = readln().toInt()
    val numbers = IntArray(size) { readln().toInt() }
    var occurrence = 0
    for (index in numbers.indices) {
        if (index < numbers.size - 2 && numbers[index + 1] - numbers[index] == 1 && numbers[index + 2] - numbers[index + 1] == 1) {
            occurrence++
        }
    }
    println(occurrence)
}