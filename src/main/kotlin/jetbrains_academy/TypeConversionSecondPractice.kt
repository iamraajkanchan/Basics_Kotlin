package jetbrains_academy

fun main() {
    val shipsOfGE = readLine()!!
    val shipsOfRA = readLine()!!
    println(shipsOfGE.toInt() / shipsOfRA.toInt())

    var name: String? = "Hello World"
    name = null
    println(name?.length)

}