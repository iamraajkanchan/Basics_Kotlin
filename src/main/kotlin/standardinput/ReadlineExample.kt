package standardinput

fun main() {
    val line = readlnOrNull()?.toInt()
    println(line)

    val isWeekend = readlnOrNull()?.toBoolean()

    val (a, b) = readln().split(' ')
    println("$a, $b")
    val (c, d, e) = readln().split(' ')
    println("$c, $d, $e")
}