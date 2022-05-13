package jetbrains_academy.collections

fun main() {
    val size = readln().toInt()
    val numbers = IntArray(size) { readln().toInt() }
    val comparingNumber = readln().toInt()
    var occurrence = 0
    for (number in numbers) {
        if (number == comparingNumber) {
            occurrence++
        }
    }
    println(occurrence)
}