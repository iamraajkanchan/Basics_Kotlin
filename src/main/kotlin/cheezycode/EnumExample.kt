package cheezycode

fun main() {
    val dayInWeek: DayInWeek = DayInWeek.Weekday
    println(dayInWeek)
    dayInWeek.printFormattedDay()
    val firstDay: Day = Day.Sunday
    println(firstDay)
    firstDay.printFormattedDay()
    val secondDay = Day.Monday;
    secondDay.printFormattedDay()
    // println(Day.valueOf("Tuesday"))
    for (day in Day.values()) {
        println(day)
    }
}

enum class Day(val number: Int) {
    // Here Sunday is a special object of Day, so you have to call it's constructor if the class has it
    Sunday(number = 1),

    // Using non-named argument to call the constructor
    Monday(2),

    // Using named argument to call the constructor
    Tuesday(number = 3),
    Wednesday(number = 4),
    Thursday(number = 5),
    Friday(number = 6),
    Saturday(number = 7);

    fun printFormattedDay() {
        println("This is $this")
    }
}

enum class DayInWeek {
    Weekday,
    Weekend;

    fun printFormattedDay() {
        println("This is $this")
    }
}