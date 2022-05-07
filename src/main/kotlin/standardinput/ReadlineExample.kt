package standardinput

fun main() {
    val line = readLine()?.toInt()!!
    println(line)

    val isWeekend = readLine()?.toBoolean()!!

    val (a, b) = readLine()!!.split(' ')
    println("$a, $b")
    val (c, d, e) = readLine()!!.split(' ')
    println("$c, $d, $e")
}