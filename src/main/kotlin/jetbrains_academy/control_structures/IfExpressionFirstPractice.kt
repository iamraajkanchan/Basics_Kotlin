package jetbrains_academy.control_structures

fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(if (a > c && a > b) {
        a
    } else if (b > c) {
        b
    } else {
        c
    })
}