package interview_practice.native_mobile_bits

class ZipExamples {
    fun simulateZipMethod() {
        val alphabets = listOf('a', 'b', 'c', 'd', 'e')
        val words = listOf("Apple", "Ball", "Cat", "Dog", "Elephant")
        val mergedAlphabets = alphabets.zip(words)
        println(mergedAlphabets)
        // Output - [(a, Apple), (b, Ball), (c, Cat), (d, Dog), (e, Elephant)]
        // List of numbers won't give the expected merged result.
        // Use list of characters or strings to give proper result.
        val digits = listOf(1.0f, 2.0f, 3.0f, 4.0f, 5.0f)
        val digitsInWord = listOf("One", "Two", "Three", "Four", "Five")
        digitsInWord.zip(digits)
        // Output - [One, Two, Three, Four, Five]
        println(digitsInWord)
    }

    fun simulateZipWithNextMethod() {
        val catList = Chunked.getCatList()
        val catSet = Chunked.getCatSet()
        val catListZip = catList.zipWithNext()
        val catSetZip = catSet.zipWithNext()
        println(catListZip)
        println(catSetZip)
    }
}