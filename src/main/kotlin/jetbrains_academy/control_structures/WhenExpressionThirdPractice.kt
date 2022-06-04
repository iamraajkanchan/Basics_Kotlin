package jetbrains_academy.control_structures

const val SQUARE = "square"
const val CIRCLE = "circle"
const val TRIANGLE = "triangle"
const val RHOMBUS = "rhombus"
fun main() {
    val printShape = when (readln().toInt()) {
        1 -> SQUARE
        2 -> CIRCLE
        3 -> TRIANGLE
        4 -> RHOMBUS
        else -> {
            println("There is no such shape!")
            return
        }
    }
    println("You have chosen a $printShape")
}