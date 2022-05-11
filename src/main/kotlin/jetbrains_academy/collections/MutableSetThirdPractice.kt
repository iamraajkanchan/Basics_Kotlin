package jetbrains_academy.collections

fun main() {
    val first = readln().split(' ').map { it.toInt() }.toSet()
    println(evenFilter(first).joinToString(" "))
}

private fun evenFilter(numbers: Set<Int>): Set<Int> {
    return numbers.filter { it % 2 == 0 }.toMutableSet()
}

private fun solution(setSource: Set<String>, listSource: MutableList<String>): MutableSet<String> {
    val returnSet = emptySet<String>().toMutableSet()
    setSource.forEach { returnSet.add(it) }
    listSource.forEach { returnSet.add(it) }
    return returnSet
}