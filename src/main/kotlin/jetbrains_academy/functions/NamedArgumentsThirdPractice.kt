package jetbrains_academy.functions

fun main() {
    greetNeo()
}

fun greetUser(
    name: String,
    admin: Boolean = false,
    smith: Boolean = false,
    honorific: String = "",
    greet: String = "Greetings",
): String {
    return if (!admin && !smith) {
        "$greet, $honorific $name"
    } else {
        "Matrix Error"
    }
}
// do not change lines above

fun greetNeo() = println(greetUser(name = "Anderson", honorific = "Mr.", greet = "Hello"))
