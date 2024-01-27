package standardinput

fun main() {
    val butterCupCount = readlnOrNull()?.toInt()
    val isWeekend = readlnOrNull()?.toBoolean()
    val isSuccessful: Boolean = !(isWeekend ?: false) && butterCupCount in 15..25 || isWeekend ?: false && butterCupCount in 10 until 20
    println(isSuccessful)
}