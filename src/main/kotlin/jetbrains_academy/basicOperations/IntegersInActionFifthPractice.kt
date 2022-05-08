package jetbrains_academy.basicOperations

class IntegersInActionFifthPractice {
    fun calculateCost() {
        val durationInDays = readln().toInt()
        val foodCostPerDay = readln().toInt()
        val oneWayFlightCost = readln().toInt()
        val stayCostPerNight = readln().toInt()
        val cost = foodCostPerDay * durationInDays + stayCostPerNight * (durationInDays - 1) + oneWayFlightCost * 2
        println(cost)
    }
}

fun main() {
    val cost = IntegersInActionFifthPractice()
    cost.calculateCost()
}