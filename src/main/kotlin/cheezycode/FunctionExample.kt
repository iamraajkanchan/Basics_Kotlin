package cheezycode

import kotlin.math.pow

fun main() {
//  Calling and Storing value from a regular method.
    var additionResult = add(5, 6)
    println(additionResult)

//    Calling and Storing value from an Inline method.
    var subtractionResult = subtract(12, 9)
    println(subtractionResult)

//    Calling a Unit method.
    modulus(13)

//    Storing a function in a variable.
    var functionClone: (num1: Int, num2: Int) -> Int = ::add
    var additionResultClone = functionClone(23, 48)
    println(additionResultClone)

//    Calling and Storing value from a named argument.
    var powerResult = power(a = 8.5, b = 9.4)
    println(powerResult)

//    Calling and Storing value from a named argument.
    powerResult = power(b = 8.5, a = 9.4)
    println(powerResult)
}

// Regular method with Parameters and ReturnType.
fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

// Inline method.
fun subtract(num1: Int, num2: Int) = num1 - num2

// Unit method.
fun modulus(num: Int) {
    val result = if (num % 2 == 0) "Even" else "Odd"
    println(result)
}

// Regular method with Parameters and ReturnType.
fun power(a: Double, b: Double): Double {
    return a.pow(b)
}