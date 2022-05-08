package jetbrains_academy.basicOperations

fun main() {
    var number = readln().toInt()
    if (number % 2 == 0) {
        number += 2
    } else if (number % 2 == 1) {
        number++
    }
    println(number)
}