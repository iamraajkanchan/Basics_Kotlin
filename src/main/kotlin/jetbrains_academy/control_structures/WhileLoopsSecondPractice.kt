package jetbrains_academy.control_structures


fun main() {
    var sum = 0
    do {
        val input = readln().toInt()
        if (input > 0) {
            sum += input
        }
    } while (input != 0)
    println(sum)
}