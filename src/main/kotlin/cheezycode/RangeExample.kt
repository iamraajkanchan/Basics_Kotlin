package cheezycode

fun main() {
    val myFirstDice = Dice()
    println(myFirstDice.roll())
    println(myFirstDice.roll())
    println(myFirstDice.roll())
    println(myFirstDice.roll())
}

class Dice {
    var sides = 6
    fun roll(): Int {
        val diceRange = 1..6
        return diceRange.random()
    }
}