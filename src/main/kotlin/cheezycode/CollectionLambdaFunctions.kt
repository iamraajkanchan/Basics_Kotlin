package cheezycode

fun main() {
    val integers = listOf<Int>(1, 5, 6, 7, 8, 6)

    val filteredInt = integers.filter {
        it == 6
    }

    val mappedInteger = integers.map {
        it * 2
    }

    println(filteredInt)
    println(mappedInteger)
}