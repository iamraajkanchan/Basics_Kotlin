package jetbrains_academy.functions

import kotlin.math.pow

fun main() {
    when (readln()) {
        "amount" -> println(finalAmount(startingAmount = readln().toInt()))
        "percent" -> println(finalAmount(yearlyPercent = readln().toInt()))
        "year" -> println(finalAmount(year = readln().toInt()))
        else -> println(finalAmount())
    }
}

private fun finalAmount(startingAmount: Int = 1000, yearlyPercent: Int = 5, year: Int = 10): Int {
    // val calculation = (1 + yearlyPercent / 100).toDouble().pow(year) // doesn't rolls the correct output
    val calculation = (1 + yearlyPercent / 100.0).pow(year) // rolls the correct output
    return (startingAmount * calculation).toInt()
}

/*
fun finalAmount(startingAmount: Int = 1000, yearlyPercent: Int = 5, year: Int = 10) =
    (startingAmount * (1 + yearlyPercent / 100.0).pow(year)).toInt()*/
