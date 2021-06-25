fun main() {
    var day:Day = Day.Sunday
    day.showTheDay()
    for (i in Day)
}

enum class Day {
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday;

    fun showTheDay() {
        println("This is $this")
    }
}