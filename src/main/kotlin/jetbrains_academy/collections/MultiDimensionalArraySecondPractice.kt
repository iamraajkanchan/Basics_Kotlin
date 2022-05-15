package jetbrains_academy.collections

fun main() {
    //Do not touch code below
    var inputArray: Array<Array<String>> = arrayOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toTypedArray()
        inputArray += strings
    }
    //write your code here
    val finalArray = arrayOf(
        arrayOf(inputArray[0][0], inputArray[0][inputArray[0].size - 1]),
        arrayOf(inputArray[inputArray.size - 1][0], inputArray[inputArray.size - 1][inputArray.size - 1]),
    )
    println("${finalArray.first().first()} ${finalArray.first().last()}")
    println("${finalArray.last().first()} ${finalArray.last().last()}")
}