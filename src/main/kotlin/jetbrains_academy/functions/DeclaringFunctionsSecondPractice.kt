package jetbrains_academy.functions

import kotlin.math.abs

fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}

fun getLastDigit(number: Int) = abs(number) % 10
