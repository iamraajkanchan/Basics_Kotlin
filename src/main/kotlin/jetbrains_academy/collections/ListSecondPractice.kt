package jetbrains_academy.collections

fun main() {
    val numbers = readln().split(' ').map { it.toInt() }.toList()
    println(solution(numbers))
}

private fun solution(numbers: List<Int>): Int {
    return numbers.sum()
}