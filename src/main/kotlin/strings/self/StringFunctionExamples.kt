package strings.self

class StringFunctionExamples {
    val validInput = "abcdefghijklmnopqrstuvwxyz1234567890"
    val validString = "abcdefghijklmnopqrstuvwxyz"
    val validNumber = "1234567890"
    val validStringWithDelimiter = "a,b,c,d,e,f,g,h"
    val validStringPath = "folder/subfolder/file.txt"

    fun getMyStringLength(message: String = validString): Int = message.length
    /**
     * Description: Returns the size of a String
     * Input: Raj
     * Output Raj: 3
     * */

    fun getMySubStringLength(message: String = validString, startStringLength: Int = 0): String = message.substring(startStringLength)
    /**
     * Description:
     * Input: Raj, 1
     * Output: aj
     * */

    fun getMySubStringLength(message: String = validString, startStringLength: Int = 0, endStringLength: Int = validString.length): String = message.substring(startStringLength, endStringLength)
    /**
     * Description: Crops a String from a certain length to a certain length.
     * Input: Raj, 1, 2
     * Output: a
     * */

    fun getMyStringTake(message: String = validString, takeLength: Int) : String = message.take(takeLength)
    /**
     * Description: Crops a String from start to a certain length.
     * Input: Raj, 2
     * Output: Ra
     * Input: Raj, 3
     * Output: Raj
     * Input: Raj, 5
     * Output: Raj
     * */

    fun getMyStringTakeLast(message: String = validString, takeLastLength: Int) : String = message.takeLast(takeLastLength)
    /**
     * Description: Crops a String from end to a certain length.
     * Input: Raj, 1
     * Output: j
     * Input: Raj, 2
     * Output: Raj: aj
     * Input: Raj, 3
     * Output: Raj
     * Input: Raj, 5
     * Output: Raj
     * */

    fun getMyStringDrop(message: String = validString, dropLength: Int) = message.drop(dropLength)
    /**
     * Description: Crops a String from a certain length.
     * Input: ABCDEFGHIJKLMNOPQRSTUVWXYZ, 2
     * Output: ABCDEFGHIJKLMNOPQRSTUVWXYZ: CDEFGHIJKLMNOPQRSTUVWXYZ
     * */

    fun getMyStringDropLast(message: String = validString, dropLastLength: Int) = message.dropLast(dropLastLength)
    /**
     * Input:
     * Output
     * */

    fun getMyStringSplit(message: String = validStringWithDelimiter, delimiter: String) = message.split(delimiter)
    /**
     * Input:
     * Output:
     * */

    fun getMyStringChunk(message: String = validString, chunkLength: Int) = message.chunked(chunkLength)
    /**
     * Input:
     * Output:
     * */

    fun getMyStringWindow(message: String = validString, windowLength: Int) = message.windowed(windowLength)
    /**
     * Input:
     * Output:
     * */

    fun checkMyStringContains(message: String = validString, literal: String) = message.contains(literal)
    /**
     * Input:
     * Output:
     * */

    fun checkMyStringContains(message: String = validString, literal: String, ignoreCase: Boolean) = message.contains(literal, ignoreCase)
    /**
     * Input:
     * Output:
     * */

    fun checkMyStringStartsWith(message: String = validString, literal: String) = message.startsWith(literal)
    /**
     * Input:
     * Output:
     * */

    fun checkMyStringEndsWith(message: String = validString, literal: String) = message.endsWith(literal)
    /**
     * Input:
     * Output:
     * */

    fun getMyStringIndex(message: String = validString, literal: String) = message.indexOf(literal)
    /**
     * Input:
     * Output:
     * */

    fun getMyStringLastIndex(message: String = validString, literal: String) = message.lastIndexOf(literal)
    /**
     * Input:
     * Output:
     * */

    fun getMyStringLastIndexWithIndex(message: String = validString, literal: String, index: Int) = message.lastIndexOf(literal, index)
    /**
     * Input:
     * Output:
     * */

    fun checkMyStringIsDigitByAny(message: String = validNumber) = message.any { it.isDigit() }
    /**
     * Input:
     * Output:
     * */

    fun checkMyStringIsLetterByAny(message: String = validString, literal: String) = message.any { it.isLetter() }
    /**
     * Input:
     * Output:
     * */

    fun checkMyStringIsWhitespaceByAny(message: String = validString, literal: String) = message.any { it.isWhitespace() }
    /**
     * Input:
     * Output:
     * */

    fun checkMyStringIsLetterOrDigitByAny(message: String = validString, literal: String) = message.any { it.isLetterOrDigit() }
    /**
     * Input
     * Output
     * */

    fun checkMyStringIsDigitByAll(message: String = validNumber) = message.all { it.isDigit() }
    /**
     * Input:
     * Output:
     * */

    fun checkMyStringIsLetterByAll(message: String = validNumber) = message.all { it.isLetter() }
    /**
     * Input:
     * Output:
     * */

    fun checkMyStringIsWhitespaceByAll(message: String = validNumber) = message.all { it.isWhitespace() }
    /**
     * Input:
     * Output:
     * */

    fun checkMyStringIsLetterOrDigitByAll(message: String = validNumber) = message.all { it.isLetterOrDigit() }
    /**
     * Input:
     * Output:
     * */

    fun replaceMyStringWithLiteral(message: String = validString, literal: String) = message.replace(literal, validString)
    /**
     * Input:
     * Output:
     * */

    fun firstReplaceMyStringWithLiteral(message: String = validString, literal: String) = message.replaceFirst(literal, validString)
    /**
     * Input:
     * Output:
     * */

    fun removePrefixFromString(message: String = validString, literal: String) = message.removePrefix(literal)
    /**
     * Input:
     * Output:
     * */

    fun removeSuffixFromString(message: String = validString, literal: String) = message.removeSuffix(literal)
    /**
     * Input:
     * Output:
     * */

    fun getSubStringBefore(message: String = validStringPath, literal: String) = message.substringBefore(literal)
    /**
     * Input:
     * Output:
     * */

    fun getSubStringAfter(message: String = validStringPath, literal: String) = message.substringAfter(literal)
    /**
     * Input:
     * Output:
     * */

    fun getSubstringBeforeLast(message: String = validStringPath, literal: String) = message.substringBeforeLast(literal)
    /**
     * Input:
     * Output:
     * */

    fun getSubstringAfterLast(message: String =validStringPath, literal: String) = message.substringAfterLast(literal)
    /**
     * Input:
     * Output:
     * */

    fun getStringFilterForDigits(message: String = validNumber) = message.filter { it.isDigit() }
    /**
     * Input:
     * Output:
     * */

    fun getStringFilterForLetters(message: String = validNumber) = message.filter { !it.isDigit() }
    /**
     * Input:
     * Output:
     * */


}