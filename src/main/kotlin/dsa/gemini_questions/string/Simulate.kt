package dsa.gemini_questions.string

import dsa.gemini_questions.string.easy.Palindrome

fun main(args: Array<String>) {
    val palindrome = Palindrome()
    palindrome.checkPalindrome("world")
    palindrome.checkPalindrome("deed")
    palindrome.checkPalindrome("rotator")
    palindrome.checkPalindrome("repaper")
    palindrome.checkPalindrome("palindromes")
}