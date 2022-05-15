package jetbrains_academy.functions

fun main() {
    println(divideTwoNumbers(4, 0))
}

fun subtractTwoNumbers(a: Long, b: Long) = println(a - b)

fun sumTwoNumbers(a: Long, b: Long) = println(a + b)

fun divideTwoNumbers(a: Long, b: Long) {
    return if (b.toInt() != 0) {
        println(a / b)
    } else {
        println("Division by 0!")
    }
}

fun multiplyTwoNumbers(a: Long, b: Long) = println(a * b)