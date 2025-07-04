package interview_practice.dsa

class DSAOnString {
    fun reverseString(name: String): String {
        var reversedName = ""
        for (i in name.length - 1 downTo 0) {
            reversedName += name[i]
        }
        return reversedName;
    }

    fun countWordInSentence(sentence: String) {
        val wordCount: HashMap<String, Int> = HashMap()
        val words = sentence.split(" ")
        for (i in 0 until words.size) {
            val currentWord = words[i]
            var countIndex = 0;
            for (j in 0 until  words.size) {
                if (currentWord.equals(words[j], true)) {
                    countIndex++
                }
            }
            wordCount[currentWord] = countIndex
        }
        for (entry in wordCount.entries) {
            println("Word: ${entry.key} has ${entry.value} occurrence")
        }
    }
}