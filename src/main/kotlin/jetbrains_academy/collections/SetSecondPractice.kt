package jetbrains_academy.collections

fun main() {

}

private fun solution(numbers1: Set<Int>, numbers2: Set<Int>): Int {
    val resultSet = numbers1 - numbers2
    return resultSet.size
}