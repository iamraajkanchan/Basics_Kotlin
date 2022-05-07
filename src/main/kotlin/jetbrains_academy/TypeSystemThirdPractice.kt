package jetbrains_academy

fun main() {
    println(getLength(readLine()))
}

fun getLength(input: String?): Int = input?.length ?: -1