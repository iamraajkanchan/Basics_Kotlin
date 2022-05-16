package jetbrains_academy.functions

val RANGE = 2..10
const val THIRTEEN = 13
fun main() {
    var thirteen = 13L
    for (i in RANGE) {
        thirteen *= THIRTEEN
        println(thirteen)
    }
}