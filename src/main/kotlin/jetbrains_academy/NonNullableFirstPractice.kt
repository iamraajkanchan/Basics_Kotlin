package jetbrains_academy

fun main() {
    val line: String = readLine()!!
    if (line != null) {
        println(line?.length)
    } else {
        println(-1)
    }
    println("22" + 0 + 2)    // 1
    println("2" + 2 + 2)     // 2
    println("2" + 2 + 1 + 1) // 3
    println("222")           // 4
}