package dsa.practice.arrays

class ArrayQuestion {
    fun swapElementOfArray(numbers: Array<Int>) {
        var i = 0;
        while (i + 1 < numbers.size) {
            val temp = numbers[i]
            numbers[i] = numbers[i + 1]
            numbers[i + 1] = temp
            i+=3
        }
        println(numbers.contentToString())
    }

    fun findSmallestElementInArray(numbers: Array<Int>) : Int {
        var smallest = Int.MAX_VALUE
        for (i in numbers.indices) {
            if (numbers[i] < smallest){
                smallest = numbers[i]
            }
        }
        return smallest
    }
    fun findLargestElementInArray(numbers: Array<Int>) : Int {
        var greatest = Int.MIN_VALUE
        for (i in numbers.indices) {
            if (numbers[i] > greatest){
                greatest = numbers[i]
            }
        }
        return greatest
    }

    fun reverseArray(numbers: Array<Int>) {
        var start = 0
        var end = numbers.size - 1
        while (start < end) {
            val temp = numbers[end]
            numbers[end] = numbers[start]
            numbers[start]=temp
            start++
            end--
        }
        println(numbers.contentToString())
    }
}