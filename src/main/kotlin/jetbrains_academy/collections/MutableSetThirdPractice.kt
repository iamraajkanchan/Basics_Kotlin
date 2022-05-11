package jetbrains_academy.collections

fun main() {
    val first = readln().split(' ').map { it.toInt() }.toMutableSet()
    val number = readln().toInt()
    println(solution(first, number).joinToString(" "))
}

private fun solution(elements: MutableSet<Int>, element: Int): MutableSet<Int> {
    return if (elements.contains(element)) {
        emptySet<Int>().toMutableSet()
    } else {
        elements
    }
}