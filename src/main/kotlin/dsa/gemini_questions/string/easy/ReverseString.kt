package dsa.gemini_questions.string.easy

// Reverse a String
class ReverseString {
    private fun reverseMethod(string: String): String {
        val stringArray = string.toCharArray()
        var i = 0
        var j = stringArray.lastIndex
        while (i < j) {
            val temp = stringArray[i]
            stringArray[i] = stringArray[j]
            stringArray[j] = temp
            i++
            j--
        }
        return stringArray.concatToString()
    }

    fun reverse(string: String) {
        println("Reversing $string : ${reverseMethod(string)}")
    }

    fun testReverseString() {
        val reverseString = ReverseString()
        reverseString.reverse("Hello")
        reverseString.reverse("Mumbai")
        reverseString.reverse("India")
    }

}