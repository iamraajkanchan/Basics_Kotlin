package jetbrains_academy.collections

fun main() {

}

private fun solution(elements: MutableList<String>, index: Int): MutableList<String> {
    elements.removeAt(index)
    return elements
}