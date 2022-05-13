package jetbrains_academy.collections

fun main() {
    val planetIndex = readln().split(' ').map { it.toInt() }.toList()
    val planetNames = readln().split(' ').toList()
    val removeName = readln()
    val solarSystem = emptyMap<Int, String>().toMutableMap()
    if (planetIndex.size == planetNames.size) {
        for (i in planetIndex.indices) {
            solarSystem += planetIndex[i] to planetNames[i]
        }
    }
    println(removing(solarSystem, removeName))
}

private fun removing(currentMap: MutableMap<Int, String>, value: String): MutableMap<Int, String> {
    val resultMap = currentMap.toMutableMap()
    for (map in currentMap) {
        if (map.value == value) {
            resultMap.remove(map.key)
        }
    }
    return resultMap
}