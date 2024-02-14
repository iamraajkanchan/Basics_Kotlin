package dsa.gemini_questions.string.easy

class Palindrome {
    private fun isPalindrome(string: String): Boolean {
        val stringArray = string.toCharArray()
        var i = 0
        var j = stringArray.lastIndex
        while (i < j) {
            println("[$i: ${stringArray[i]}, $j: ${stringArray[j]}]")
            if (stringArray[i] != stringArray[j])
                return false
            i++
            j--
            println("[$i, $j] condition ${i < j}")
        }
        return true
    }

    fun checkPalindrome(string: String) {
        println("$string is a palindrome : ${isPalindrome(string)}")
    }
}