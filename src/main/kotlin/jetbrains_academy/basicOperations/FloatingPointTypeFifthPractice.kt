package jetbrains_academy.basicOperations

const val GRAVITY_CONSTANT = 9.8
fun main() {
    val fluidDensity = readln().toDouble()
    val heightLiquidColumn = readln().toDouble()
    val liquidPressure = fluidDensity * GRAVITY_CONSTANT * heightLiquidColumn
    println(liquidPressure)
}