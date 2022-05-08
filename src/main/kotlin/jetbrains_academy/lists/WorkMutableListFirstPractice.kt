package jetbrains_academy.lists

fun main() {
    val numbers = readln().split(' ').map { it.toInt() }.toMutableList()
    val sum = numbers.sum()
    val tempNumbers = numbers.toMutableList()
    tempNumbers.removeAt(tempNumbers.lastIndex - 1)
    numbers.clear()
    numbers.add(sum)
    numbers += tempNumbers
    println(numbers.joinToString())
}