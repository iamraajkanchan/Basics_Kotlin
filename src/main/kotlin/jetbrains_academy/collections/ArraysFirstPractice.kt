package jetbrains_academy.collections

fun main() {
    val numbers = IntArray(100) { 0 }
    numbers[0] = 1
    numbers[9] = 10
    numbers[numbers.size - 1] = 100
    println(numbers.joinToString())
}