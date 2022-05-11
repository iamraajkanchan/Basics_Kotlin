package jetbrains_academy.collections

fun main() {
    val first = readln().split(' ').map { it.toInt() }.toSet()
    val second = readln().split(' ').map { it.toInt() }.toSet()
    val result = solution(first, second)
    println(result.joinToString())
}

private fun solution(first: Set<Int>, second: Set<Int>): Set<Int> {
    val resultSet = emptySet<Int>().toMutableSet()
    for (firstElement in first) {
        if (firstElement % second.size == 0) {
            resultSet.add(firstElement)
        }
    }
    return resultSet
}