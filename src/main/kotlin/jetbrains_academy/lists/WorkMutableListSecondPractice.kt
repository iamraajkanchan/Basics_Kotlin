package jetbrains_academy.lists

fun main() {
    val firstList = readLine()!!.split(' ').map { it }.toMutableList()
    val secondList = readLine()!!.split(' ').map { it }.toMutableList()
    val resultList = firstList + secondList
    println(resultList.joinToString())
    println(resultList)
}