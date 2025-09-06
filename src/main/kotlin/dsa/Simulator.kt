package dsa

import dsa.practice.arrays.Practice060925
import kotlin.random.Random

val evenNumbers = intArrayOf(2, 4, 6, 8)
val oddNumbers = intArrayOf(1, 3, 5, 7, 9)
const val randomArraySize = 15
val range = 1..100
val randomArray = IntArray(randomArraySize) { Random.nextInt(range.first, range.last + 1) }

fun main() {
    simulatePractice060925()
}

fun simulatePractice060925() {
    val practice = Practice060925()
    practice.simpleArrayProperties(randomArray)
    practice.reverseArray(randomArray)
}