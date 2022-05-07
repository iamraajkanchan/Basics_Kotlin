package jetbrains_academy

/**
 * Write a program that finds the frequency of occurrences of substring in given string.
 * https://hyperskill.org/learn/step/9036
 * */

fun main() {
    val line1 = readLine()!!
    val line2 = readLine()!!
    val result = line1.split(line2)
    println(result.size - 1)
}