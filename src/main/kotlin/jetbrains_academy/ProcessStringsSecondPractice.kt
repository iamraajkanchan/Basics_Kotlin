package jetbrains_academy

fun main() {
    val input = readLine()!!
    var tempStr = ""
    for (i in input.indices) {
        tempStr += input[i].toString().repeat(2)
    }
    println(tempStr)
}