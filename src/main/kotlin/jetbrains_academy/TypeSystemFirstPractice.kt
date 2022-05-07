package jetbrains_academy

const val DIVIDER = 10

fun main() {
    val a = readLine()?.toInt()!!
    reverse(a)
}

fun reverse(input: Int?): Int {
    var number = input
    return if (number != null) {
        var reverse = 0
        while (number != 0) {
            val remainder = number % DIVIDER
            reverse = reverse * DIVIDER + remainder
            number /= DIVIDER
        }
        reverse
    } else {
        -1
    }
}