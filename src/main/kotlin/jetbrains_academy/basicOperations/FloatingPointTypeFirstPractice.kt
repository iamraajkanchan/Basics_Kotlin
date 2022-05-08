package jetbrains_academy.basicOperations

fun main() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()
    var x: Double? = null
    if (a != 0.0) {
        x = (c - b) / a
    }
    println(x?.toString())
}