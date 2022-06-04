package jetbrains_academy.control_structures

fun main() {
    val input = readln().toInt()
    var i = 0
    while (i * i < input) {
        i++
        if (i * i > input) {
            break
        }
        println(i * i)
    }
}