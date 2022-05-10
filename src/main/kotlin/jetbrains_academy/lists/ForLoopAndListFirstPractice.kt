package jetbrains_academy.lists

fun main() {
    val size = readln().toInt()
    val mutList = mutableListOf<Int>()
    for (i in 0 until size) {
        mutList.add(readln().toInt())
    }
    val matchInput = readln().toInt()
    if (mutList.contains(matchInput)) {
        println("YES")
    } else {
        println("NO")
    }
}