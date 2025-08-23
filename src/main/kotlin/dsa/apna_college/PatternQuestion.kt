package dsa.apna_college

class PatternQuestion {
    fun printSquarePatternWithSameElement(length: Int) {
        for (i in 1.. length) {
            for (j in 1 .. length) {
                print(j)
            }
            println()
        }
    }

    fun printSquarePatternWithDifferentElement(length: Int) {
        var temp: Int = 1
        for (i in 1.. length) {
            for (j in 1 .. length) {
                print("$temp ")
                temp++
            }
            println()
        }
    }

    fun printTrianglePatternWithSameElementInAscendingOrder(length: Int) {
        for (i in 1 ..  length) {
            for (j in 1..i) {
                print("*")
            }
            println()
        }
    }

    fun printTrianglePatternWithSameElementInDescendingOrder(length: Int) {
        for (i in 1 ..  length) {
            for (j in length downTo i) {
                print("*")
            }
            println()
        }
    }
}