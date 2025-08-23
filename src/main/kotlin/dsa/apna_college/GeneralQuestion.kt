package dsa.apna_college

class GeneralQuestion {
    fun printFibonacci(length: Int) {
        var a = 0
        var b = 1
        repeat(length) {
            print("$a ")
            val temp = a + b
            a = b
            b = temp
        }
    }
}