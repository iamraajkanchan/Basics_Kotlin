package jetbrains_academy.functions

fun main() {
    printStars(10)
    println()
}

fun printStars(n: Int) {
    if (n < 1) return
    print("*")
    printStars(n - 1)
}