package interview_practice.native_mobile_bits

import java.util.stream.Collectors

class ArrayExamples {
    fun simulate() {
        val numberIntArray = IntArray(5) { 2 * 2 }
        numberIntArray.apply { print("[") }.map { m -> "$m " }.forEach { f -> print(f) }
            .also {
                print("]")
                repeat(2) { println() }
            }
        val numberLongArray = LongArray(5) { 2L * 2 }
        numberLongArray.also { print("[") }.map { m -> "$m " }.forEach { f -> print(f) }
            .apply {
                print("]")
                repeat(2) { println() }
            }
        val numberFloatArray = FloatArray(5) { 2f * 2 }
        numberFloatArray.apply { print("[") }.map { m -> "$m " }.forEach { f -> print(f) }
            .also {
                print("]")
                repeat(2) { println() }
            }
        val numberDoubleArray = DoubleArray(5) { 2.0 * 2 }
        numberDoubleArray.also { print("[") }.map { m -> "$m " }.forEach { f -> print(f) }
            .apply {
                print("]")
                repeat(2) { println() }
            }
    }
}