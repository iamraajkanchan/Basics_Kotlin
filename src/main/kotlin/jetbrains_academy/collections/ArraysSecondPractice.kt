package jetbrains_academy.collections

fun main() {
    /*
    val longs = LongArray(3) { 100_000_000_001 }
    longs[1] = 100_000_000_002
    longs[2] = 100_000_000_003
    println(longs.joinToString())
    */
    val longs = longArrayOf(100_000_000_001, 100_000_000_002, 100_000_000_003)
    println(longs.joinToString())
    val numbers = intArrayOf(12, 17, 8, 101, 33)
}