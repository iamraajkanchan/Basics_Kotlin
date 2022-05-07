package jetbrains_academy

fun main() {
    println("Input for Hours")
    val (hour, minutes, seconds) = readLine()!!.split(' ')
    println("Input for Date")
    val (date, month, year) = readLine()!!.split(' ')
    println("$hour:$minutes:$seconds $date/$month/$year")
    println("seasons".repeat(7))
    val example = "Kotlin is a language"
    example.replace(" language", "n island")
    println(example)
}