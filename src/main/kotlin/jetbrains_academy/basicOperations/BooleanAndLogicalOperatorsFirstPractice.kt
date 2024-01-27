package jetbrains_academy.basicOperations

fun main() {
    val invitation = readlnOrNull()?.toBoolean()
    val gift = readlnOrNull()?.toBoolean()
    println(invitation ?: false && gift ?: false)
}