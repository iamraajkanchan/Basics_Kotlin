package standardinput

fun main() {
    val butterCupCount = readLine()?.toInt()!!
    val isWeekend = readLine()?.toBoolean()!!
    val isSuccessful: Boolean = !isWeekend && butterCupCount in 15..25 || isWeekend && butterCupCount in 10..20
    println(isSuccessful)
}