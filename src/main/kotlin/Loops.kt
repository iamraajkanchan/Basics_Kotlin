fun main() {
//    For loop with Range
    println("For loop with Range")
    for (i in 1..5) {
        println(i)
    }

//    For loop with Until
    println("For loop with Until")
    for (i in 1 until 5) {
        println(i)
    }

//    For loop with step
    println("For loop with Step")
    for (i in 1..10 step 2) {
        println(i)
    }

//    For loop with down
    println("For loop with downTo")
    for (i in 5 downTo 1) {
        println(i)
    }

//    For loop with down and step
    println("For loop with downTo and step")
    for (i in 10 downTo 1 step 2) {
        println(i)
    }

    
}