package jetbrains_academy.collections

fun main() {

}

private fun solution(first: Set<String>, second: MutableList<String>): Boolean {
    return first == second.toSet()
}