package jetbrains_academy

fun main() {
    val character = readLine()?.first()!!
    if (character.isLetterOrDigit()) {
        if (character.isLetter()) {
            println(character.isUpperCase())
        } else if (character.isDigit()) {
            println(character in '1'..'9')
        }
    }
}