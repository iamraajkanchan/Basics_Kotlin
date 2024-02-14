package dsa.gemini_questions.string.easy

import jetbrains_academy.getLength

class MakeThreeStringsEqual {
    private fun findMinimumOperations(firstString: String, secondString: String, thirdString: String): Int {
        val inputLengths = listOf(firstString, secondString, thirdString).map(String::length).toList()
        println(inputLengths)
        return -1
    }

    companion object {
        fun testMakeThreeStringsEqual() {
            val makeThreeStringsEqual = MakeThreeStringsEqual()
            makeThreeStringsEqual.findMinimumOperations("abc", "abd", "ab")
        }
    }
}