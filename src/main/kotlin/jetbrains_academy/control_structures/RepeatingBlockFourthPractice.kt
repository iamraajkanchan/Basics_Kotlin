package jetbrains_academy.control_structures

const val CONDITION_LARGER = 1
const val CONDITION_SMALLER = -1
const val CONDITION_PERFECT = 0
fun main() {
    val numberOfParts = readln().toInt()
    var largeParts = 0
    var smallerParts = 0
    var perfectParts = 0
    repeat(numberOfParts) {
        val size = readln().toInt()
        if (size in -1..1) {
            when (size) {
                CONDITION_LARGER -> largeParts++
                CONDITION_SMALLER -> smallerParts++
                CONDITION_PERFECT -> perfectParts++
            }
        }
    }
    println("$perfectParts $largeParts $smallerParts")
}