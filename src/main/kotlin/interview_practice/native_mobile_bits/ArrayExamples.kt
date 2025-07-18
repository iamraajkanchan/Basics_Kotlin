package interview_practice.native_mobile_bits

class ArrayExamples {

    fun createIntArray() {
        val numberIntArray = IntArray(5) { 2 * 2 }
        numberIntArray.apply { print("[") }.map { m -> "$m " }.forEach { f -> print(f) }
            .also {
                print("]")
                repeat(2) { println() }
            }
    }

    fun createLongArray() {
        val numberLongArray = LongArray(5) { 2L * 2 }
        numberLongArray.also { print("[") }.map { m -> "$m " }.forEach { f -> print(f) }
            .apply {
                print("]")
                repeat(2) { println() }
            }
    }

    fun createFloatArray() {
        val numberFloatArray = FloatArray(5) { 2f * 2 }
        numberFloatArray.apply { print("[") }.map { m -> "$m " }.forEach { f -> print(f) }
            .also {
                print("]")
                repeat(2) { println() }
            }
    }

    fun createDoubleArray() {
        val numberDoubleArray = DoubleArray(5) { 2.0 * 2 }
        numberDoubleArray.also { print("[") }.map { m -> "$m " }.forEach { f -> print(f) }
            .apply {
                print("]")
                repeat(2) { println() }
            }
    }
}