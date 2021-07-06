import kotlin.math.pow

fun main() {
    println(sumInLambdaExample(2.3, 3.6))
    println(powerInLambdaExample(2.3, 3.6))
    var fn: (num1: Double, num2: Double) -> Double = ::sumInLambdaExample
    println(fn(3.5, 3.5))
    fn = ::powerInLambdaExample
    println(fn(3.5, 3.5))
}

fun sumInLambdaExample(num1: Double, num2: Double): Double {
    return num1 + num2
}

fun powerInLambdaExample(num1: Double, num2: Double): Double {
    return num1.pow(num2)
}

