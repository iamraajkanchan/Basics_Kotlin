package cheezycode

fun main() {
//    Implicit Array of Strings
    var stringArray = arrayOf("One", "Two", "Three")
//    Implicit Array of Integers
    var intArray = arrayOf(1, 2, 4, 5)
//    Explicit Array of Double
    var doubleArray = arrayOf<Double>(1.0, 2.0, 3.0, 4.0, 5.0, 6.0)
    for (i in stringArray) {
        println(i)
    }
    for ((i, e) in intArray.withIndex()) {
        println("$i - $e")
    }
    println(doubleArray.get(0))
    println(doubleArray[2])
    doubleArray.set(3, 9.0)
    println(doubleArray.size)
}