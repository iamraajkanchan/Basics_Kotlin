package jetbrains_academy.collections

fun main() {
    val firstInt = readln().split(' ').map { it.toInt() }.toList()
    val secondInt = readln().split(' ').map { it.toInt() }.toList()
    val resultMap = emptyMap<Int, Int>().toMutableMap()
    if (firstInt.size == firstInt.size) {
        for (i in firstInt.indices) {
            resultMap += Pair(firstInt[i], secondInt[i])
        }
    }
    println(summator(resultMap))
}

fun summator(map: Map<Int, Int>): Int {
    var sum = 0
    for (mapItem in map) {
        if (mapItem.key % 2 == 0) {
            sum += mapItem.value
        }
    }
    return sum
}