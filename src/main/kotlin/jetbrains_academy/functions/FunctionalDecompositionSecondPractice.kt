package jetbrains_academy.functions

fun main() {
    println(getFullNames())
}
private fun getFullNames() = createFullName(readln(), readln())
private fun createFullName(firstName: String, lastName: String): String = "$firstName $lastName"