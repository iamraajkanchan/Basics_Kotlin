package dsa.gemini_questions.string.easy

class MakeThreeStringsEqual {
    private fun findMinimumOperations(firstString: String, secondString: String, thirdString: String): Int {
        val inputLengths = listOf(firstString, secondString, thirdString).associateWith(String::length)
        for (entry in inputLengths.entries) {
            var i = 0
            if (entry.value > 2) {
                while (i + 1 < entry.key.length) {
                    i++
                }
            } else return -1
        }
        return -1
    }

    companion object {
        fun testMakeThreeStringsEqual() {
            val makeThreeStringsEqual = MakeThreeStringsEqual()
            makeThreeStringsEqual.findMinimumOperations("abc", "abd", "ab")
        }
    }
}