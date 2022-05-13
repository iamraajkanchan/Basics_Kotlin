package jetbrains_academy.collections

fun main() {
    val items = readln().split(' ').toList()
    val prices = readln().split(' ').map { it.toInt() }.toList()
    val shoppingList = readln().split(' ').toMutableList()
    val priceList = emptyMap<String, Int>().toMutableMap()
    if (items.size == prices.size) {
        for (i in items.indices) {
            priceList += Pair(items[i], prices[i])
        }
    }
    println(bill(priceList, shoppingList))
}

private fun bill(priceList: Map<String, Int>, shoppingList: MutableList<String>): Int {
    var sum = 0
    for (item in shoppingList) {
        if (priceList.containsKey(item)) {
            sum += priceList[item]!!
        }
    }
    return sum
}