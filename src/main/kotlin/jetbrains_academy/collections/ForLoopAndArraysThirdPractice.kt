package jetbrains_academy.collections

fun main() {
    val size = readln().toInt()
    val numbers = IntArray(size) { readln().toInt() }
    var firstNumber = numbers[0]
    for (number in numbers) {
        if (firstNumber < number) {
            firstNumber = number
        }
    }
    println(numbers.indexOf(firstNumber))
}