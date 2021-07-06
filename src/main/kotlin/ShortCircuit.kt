fun main() {
    var i: Int = 10
    var j: Int = 11

    println("Example of First Short Circuit")
    var resultFirstShortCircuit =
        i == 10 || j++ == 12 // Here because the first condition is satisfied so the send condition is not executed
    println(i)
    println(j)

    var x: Int = 11
    var y: Int = 11

    println("Example of Second Short Circuit")
    var resultSecondShortCircuit =
        x == 10 || y++ == 12 // Here because the first condition is not satisfied so the send condition is executed
    println(x)
    println(y)
}