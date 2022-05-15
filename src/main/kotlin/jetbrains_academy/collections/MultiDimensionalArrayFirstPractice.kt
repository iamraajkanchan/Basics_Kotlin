package jetbrains_academy.collections

fun main() {
    val array3D = arrayOf(
        arrayOf<String>("[0][0]", "[0][1]", "[0][2]"),
        arrayOf<String>("[1][0]", "[1][1]", "[1][2]"),
    )
    println(array3D.contentDeepToString())
}