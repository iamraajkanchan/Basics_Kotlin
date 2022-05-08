package jetbrains_academy.basicOperations

fun main() {
    val invitation = readLine()?.toBoolean()!!
    val gift = readLine()?.toBoolean()!!
    println(invitation && gift)
}