package jetbrains_academy

fun main() {
    val input = readLine()!!
    var unit = 0
    while (input.lastIndex != input.length) {
        unit++
    }
    println(unit)
}

fun logic1() {
    var input = readLine()!!.toInt()
    var tens = 0
    while (input != 0) {
        tens++
        input /= 10
    }
    println(tens)
}