fun main() {
    val number: Int = 5
    var includingResult = number in 1..5 //1,2,3,4,5
    println(includingResult)
    var excludingResult = number in 1 until 5 // 1,2,3,4
    println(excludingResult)
}