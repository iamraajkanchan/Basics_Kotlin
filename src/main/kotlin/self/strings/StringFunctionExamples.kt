package self.strings

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
     * Input: ABCDEFGHIJKLMNOPQRSTUVWXYZ, 2
     * Output: AB
     * Input: ABCDEFGHIJKLMNOPQRSTUVWXYZ, 3
     * Output: ABC
     * Input: ABCDEFGHIJKLMNOPQRSTUVWXYZ, 30
     * Output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
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
     * Description: Crops a String from last to a certain length
     * Input: ABCDEFGHIJKLMNOPQRSTUVWXYZ, 2
     * Output: ABCDEFGHIJKLMNOPQRSTUVWXYZ: ABCDEFGHIJKLMNOPQRSTUVWX
     * */

    fun getMyStringSplit(message: String = validStringWithDelimiter, delimiter: String) = message.split(delimiter)
    /**
     * Description: Splits a string based on the value of provided delimiter into an array of Strings or Characters.
     * Input: "a,b,c,d,e,f,g,h", ","
     * Output: {a|b|c|d|e|f|g|h}
     * */

        fun getMyStringChunk(message: String = validString, chunkLength: Int) = message.chunked(chunkLength) {char -> "**$char**"}
    /**
     * Description: Splits a string into non-overlapping chunks of a fixed maximum size.
     * Input: ABCDEFGHIJKLMNOPQRSTUVWXYZ, 3
     * Output: [**ABC**, **DEF**, **GHI**, **JKL**, **MNO**, **PQR**, **STU**, **VWX**, **YZ**]
     * */

    fun getMyStringWindow(message: String = validString, windowLength: Int) = message.windowed(windowLength) {char -> "**$char**"}
    /**
     * Description:
     * Input: ABCDEFGHIJKLMNOPQRSTUVWXYZ, 3
     * Output: [**ABC**, **BCD**, **CDE**, **DEF**, **EFG**, **FGH**, **GHI**, **HIJ**, **IJK**, **JKL**, **KLM**, **LMN**, **MNO**, **NOP**, **OPQ**, **PQR**, **QRS**, **RST**, **STU**, **TUV**, **UVW**, **VWX**, **WXY**, **XYZ**]
     * */

    fun checkMyStringContains(message: String = validString, literal: String) = message.contains(literal)
    /**
     * Description: Compares String literals with any String and returns True or False accordingly
     *
     * Input:   ABCDEFGHIJKLMNOPQRSTUVWXYZ, QRS
     *          ABCDEFGHIJKLMNOPQRSTUVWXYZ, QUERY
     * Output:  Contains QRS: true
     *          Contains QUERY: false
     * */

    fun checkMyStringContains(message: String = validString, literal: String, ignoreCase: Boolean) = message.contains(literal, ignoreCase)
    /**
     * Description:
     * Input:
     * Output:
     * */

    fun checkMyStringStartsWith(message: String = validString, literal: String) = message.startsWith(literal)
    /**
     * Description:
     * Input:
     * Output:
     * */

    fun checkMyStringEndsWith(message: String = validString, literal: String) = message.endsWith(literal)
    /**
     * Description:
     * Input:
     * Output:
     * */

    fun getMyStringIndex(message: String = validString, literal: String) = message.indexOf(literal)
    /**
     * Description:
     * Input:
     * Output:
     * */

    fun getMyStringLastIndex(message: String = validString, literal: String) = message.lastIndexOf(literal)
    /**
     * Description:
     * Input:
     * Output:
     * */

    fun getMyStringLastIndexWithIndex(message: String = validString, literal: String, index: Int) = message.lastIndexOf(literal, index)
    /**
     * Description:
     * Input:
     * Output:
     * */

    fun checkMyStringIsDigitByAny(message: String = validNumber) = message.any { it.isDigit() }
    /**
     * Description:
     * Input:
     * Output:
     * */

    fun checkMyStringIsLetterByAny(message: String = validString, literal: String) = message.any { it.isLetter() }
    /**
     * Description:
     * Input:
     * Output:
     * */

    fun checkMyStringIsWhitespaceByAny(message: String = validString, literal: String) = message.any { it.isWhitespace() }
    /**
     * Description:
     * Input:
     * Output:
     * */

    fun checkMyStringIsLetterOrDigitByAny(message: String = validString, literal: String) = message.any { it.isLetterOrDigit() }
    /**
     * Description:
     * Input:
     * Output:
     * */

    fun checkMyStringIsDigitByAll(message: String = validNumber) = message.all { it.isDigit() }
    /**
     * Description:
     * Input:
     * Output:
     * */

    fun checkMyStringIsLetterByAll(message: String = validNumber) = message.all { it.isLetter() }
    /**
     * Description:
     * Input:
     * Output:
     * */

    fun checkMyStringIsWhitespaceByAll(message: String = validNumber) = message.all { it.isWhitespace() }
    /**
     * Description:
     * Input:
     * Output:
     * */

    fun checkMyStringIsLetterOrDigitByAll(message: String = validNumber) = message.all { it.isLetterOrDigit() }
    /**
     * Description:
     * Input:
     * Output:
     * */

    fun replaceMyStringWithLiteral(message: String = validString, literal: String) = message.replace(literal, validString)
    /**
     * Description:
     * Input:
     * Output:
     * */

    fun firstReplaceMyStringWithLiteral(message: String = validString, literal: String) = message.replaceFirst(literal, validString)
    /**
     * Description:
     * Input:
     * Output:
     * */

    fun removePrefixFromString(message: String = validString, literal: String) = message.removePrefix(literal)
    /**
     * Description:
     * Input:
     * Output:
     * */

    fun removeSuffixFromString(message: String = validString, literal: String) = message.removeSuffix(literal)
    /**
     * Description:
     * Input:
     * Output:
     * */

    fun getSubStringBefore(message: String = validStringPath, literal: String) = message.substringBefore(literal)
    /**
     * Description:
     * Input:
     * Output:
     * */

    fun getSubStringAfter(message: String = validStringPath, literal: String) = message.substringAfter(literal)
    /**
     * Description:
     * Input:
     * Output:
     * */

    fun getSubstringBeforeLast(message: String = validStringPath, literal: String) = message.substringBeforeLast(literal)
    /**
     * Description:
     * Input:
     * Output:
     * */

    fun getSubstringAfterLast(message: String =validStringPath, literal: String) = message.substringAfterLast(literal)
    /**
     * Description:
     * Input:
     * Output:
     * */

    fun getStringFilterForDigits(message: String = validNumber) = message.filter { it.isDigit() }
    /**
     * Description:
     * Input:
     * Output:
     * */

    fun getStringFilterForLetters(message: String = validNumber) = message.filter { !it.isDigit() }
    /**
     * Description:
     * Input:
     * Output:
     * */


}