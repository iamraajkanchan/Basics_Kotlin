package jetbrains_academy.functions

fun main() {
    println(tip(50))
    println(tip(50, 20))
}

private fun tip(bill: Int, percentage: Int = 10): Int {
    return (bill * percentage) / 100
}

fun getVolume(length: Int, width: Int = 1, height: Int = 1): Int {
    return length * width * height
}