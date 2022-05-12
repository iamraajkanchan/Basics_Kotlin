package cheezycode

fun main() {
    var i: Int = 10;
    var j: Int = 10;
//    i++ post increment
//    ++i pre increment
    println(i++ + ++i)
//    Here i++ increments the value of 10 to 11 & ++i converts 11 to 12 because of pre increment operator
    println(j++ + j++)
//    Here j++ increments the value of 10 to 11 & j++ converts 11 to 12 but instead of add 10 + 12, it ads 10 + 11 because of post increment operator
}