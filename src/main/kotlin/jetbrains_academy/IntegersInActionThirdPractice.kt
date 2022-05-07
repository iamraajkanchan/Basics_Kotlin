package jetbrains_academy

fun main() {
    val squirrels = readln().toInt()
    val nuts = readln().toInt()
    if (squirrels < 10_000 && nuts < 10_000) {
        println(nuts % squirrels)
    }
}