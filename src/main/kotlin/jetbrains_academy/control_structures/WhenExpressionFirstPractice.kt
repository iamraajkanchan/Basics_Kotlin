package jetbrains_academy.control_structures

const val MOVE_UP = "move up"
const val MOVE_DOWN = "move down"
const val MOVE_LEFT = "move left"
const val MOVE_RIGHT = "move right"
const val STOP = "do not move"
const val INVALID = "error!"
fun main() {
    val showInstruction = when (readln().toInt()) {
        1 -> MOVE_UP
        2 -> MOVE_DOWN
        3 -> MOVE_LEFT
        4 -> MOVE_RIGHT
        0 -> STOP
        else -> INVALID
    }
    println(showInstruction)
}