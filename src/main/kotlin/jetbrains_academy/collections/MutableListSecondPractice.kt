package jetbrains_academy.collections

fun main() {
    val strings = readln().split(' ').toMutableList()
    val replaceString = readln()
    // println(solution(strings, replaceString).joinToString(" "))
    // println(secondSolution(strings, replaceString).joinToString(" "))
    println(thirdSolution(strings, replaceString).joinToString(" "))
}

/* Gives the proper result but not get approval from hyper skill*/
private fun solution(strings: MutableList<String>, str: String): MutableList<String> {
    if (strings.contains(str)) {
        for (index in strings.indices) {
            if (strings[index] == str) {
                strings[index] = "Banana"
                return strings
            }
        }
    }
    return strings
}

/* Not giving the proper result  */
private fun secondSolution(strings: MutableList<String>, str: String): MutableList<String> {
    strings.replaceAll { e ->
        (if (e == str) {
            e.replace(str, "Banana")
        } else {
            e.replace(e, "")
        }).toString()
    }
    return strings
}

/* Not giving the proper result */
private fun thirdSolution(strings: MutableList<String>, str: String): MutableList<String> {
    strings.map { e -> (if (e == str) e.replace(str, "Banana") else e.replace(str, "")).toString() }
    return strings
}