package dsa.gemini_questions.string.easy

class RomanToInteger {
    private fun convertRomanToInt(string: String): Int {
        val iPair = Pair('I', 1)
        val vPair = Pair('V', 5)
        val xPair = Pair('X', 10)
        val lPair = Pair('L', 50)
        val cPair = Pair('C', 100)
        val dPair = Pair('D', 500)
        val mPair = Pair('M', 1000)
        val romanMap = mapOf(iPair, vPair, xPair, lPair, cPair, dPair, mPair)
        var result = 0
        var i = 0
        while (i < string.length) {
            val currentChar = string[i]
            val currentValue = romanMap[currentChar] ?: return 0
            if (i + 1 < string.length) {
                val nextChar = string[i + 1]
                val nextValue = romanMap[nextChar] ?: return 0
                if (currentValue < nextValue) {
                    result += nextValue - currentValue
                    i += 2
                } else {
                    result += currentValue
                    i++
                }
            } else {
                result += currentValue
                i++
            }
        }
        return result
    }

    private fun getInterValueFromRomanNumber(string: String) {
        println("$string = ${romanToInt(string)}")
    }

    private fun valueOfRomanCharacters(s: Char): Int {
        when (s) {
            'M' -> return 1000
            'D' -> return 500
            'C' -> return 100
            'L' -> return 50
            'X' -> return 10
            'V' -> return 5
            'I' -> return 1
        }
        return 1
    }

    private fun romanToInt(s: String): Int {
        var result: Int = 0
        // example: 27 -> XX(20) V(5) II(2) -> XXVII
        for (i in (s.indices)) {
            if (((i + 1) < s.length) && (valueOfRomanCharacters(s[i + 1]) > valueOfRomanCharacters(s[i]))) {
                println("valueOfCharacters(s[$i + 1]) : ${valueOfRomanCharacters(s[i + 1])}, valueOfCharacters(s[$i]) : ${valueOfRomanCharacters(s[i])}")
                result -= valueOfRomanCharacters(s[i])
            } else {
                result += valueOfRomanCharacters(s[i])
            }
        }
        return result
    }

    companion object {
        fun testRomanToInteger() {
            val romanToInteger = RomanToInteger()
            romanToInteger.getInterValueFromRomanNumber("III")
            romanToInteger.getInterValueFromRomanNumber("LVIII")
            romanToInteger.getInterValueFromRomanNumber("MCMXCIV")
        }
    }
}