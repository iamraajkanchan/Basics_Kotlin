package jetbrains_academy.functions

fun main() {
    /*val old = readln().toInt()
    val kilometers = readln().toInt()
    val maxSpeed = readln().toInt()
    val isAutomatic = readln().toBoolean()*/
    println(carPrice())
}

fun carPrice(old: Int = 5, kilometers: Int = 1_00_000, maximumSpeed: Int = 120, automatic: Boolean = false): Int {
    var price = 20000
    /* Every year the price of the car decreases by 2000$ */
    price -= 2000 * old
    /* The price goes down by 100$ for every kilometer per hour less than 120 km/h and increases by 100$ for every kilometer per hour greater than 120 km/h. */
    if (maximumSpeed < 120) {
        price -= 100 * kilometers
    } else {
        price += 100 * kilometers
    }
    /* The price lowers by 200$ for every 10000 kilometers that the car passed. For example, for 19999 km, the price decreases by 200 dollars, but for 20000 km the price lowers by 400 dollars. */
    if (kilometers % 10_000 == 0) {
        price -= 200 * (kilometers / 10_000)
    } else {
        price -= 200 * ((kilometers / 10_000) - 1)
    }
    /* If the car has automatic transmission, the price of the car goes up by 1500$, otherwise, it remains the same. */
    if (automatic) {
        price += 1500
    }
    return price
}