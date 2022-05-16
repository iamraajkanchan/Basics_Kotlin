package jetbrains_academy.functions

private fun sumRecursive(n: Int): Int {
    var sum = 0
    if (n < 1) return sum + sumRecursive(n - 1)
    return sum + sumRecursive(n - 1)
}

fun main() {
    val n = readLine()!!.toInt()
    print(sumRecursive(n))
}