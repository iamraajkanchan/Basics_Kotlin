package jetbrains_academy

fun main() {
    val input = readLine()!!
    var sumOfFirstThreeDigits = 0
    for (i in 0 until 2) {
        sumOfFirstThreeDigits += input[i].toString().toInt()
    }
    var sumOfLastThreeDigits = 0
    for (i in 3 until input.length) {
        sumOfLastThreeDigits += input[i].toString().toInt()
    }
    if (sumOfFirstThreeDigits == sumOfLastThreeDigits) {
        println("Lucky")
    } else {
        println("Regular")
    }
}
