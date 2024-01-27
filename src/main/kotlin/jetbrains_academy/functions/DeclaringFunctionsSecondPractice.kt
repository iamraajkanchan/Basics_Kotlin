package jetbrains_academy.functions

import kotlin.math.abs

fun main() {
    val a = readlnOrNull()?.toInt()
    println(getLastDigit(a ?: 0))
}

fun getLastDigit(number: Int) = abs(number) % 10
