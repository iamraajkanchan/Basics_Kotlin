package jetbrains_academy.functions

fun main() {
    val letter = readlnOrNull()?.first()

    println(isVowel(letter ?: ' '))
}

private fun isVowel(char: Char) = with(char.lowercaseChar()) {
    this == 'a' || this == 'e' || this == 'i' || this == 'o' || this == 'u'
}