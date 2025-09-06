package dsa.practice.arrays

class Practice060925 {

    fun simpleArrayProperties(numbers: IntArray) {
        println("Size of an Array : ${numbers.size}")
        println("Last Index of an Array : ${numbers.size - 1}")
        for(i in numbers.indices) {
            println("Index: $i -> Element: ${numbers[i]}")
        }
    }
    fun reverseArray(numbers: IntArray) {
        println("Array Before Reverse Operation : ${numbers.contentToString()}")
        var start = 0
        var end = numbers.size - 1
        while (start < end) {
            var temp = numbers[end]
            numbers[end] = numbers[start]
            numbers[start] = temp
            start++
            end--
        }
        println("Array After Reverse Operation : ${numbers.contentToString()}")
    }
}