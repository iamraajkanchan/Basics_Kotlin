package jetbrains_academy.control_structures


fun main() {
    var maxNumber = 0
    do {
        val input = readln().toInt()
        if (maxNumber < input) {
            maxNumber = input
        }
    } while (input != 0)
    println(maxNumber)
}