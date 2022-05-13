package jetbrains_academy.collections

fun main() {
    val size = readln().toInt()
    val numbers = IntArray(size) { readln().toInt() }
    val comparingNumber = readln().toInt()
    if (numbers.contains(comparingNumber)) {
        println("YES")
        return
    } else {
        println("NO")
        return
    }
}