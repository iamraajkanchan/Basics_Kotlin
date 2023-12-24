package cheezycode

fun main() {

    val car = Automobile(name = "Mercedes", 4, 5, true)
    println("${car.name} has airbags ${car.airBagsAvailability}")

    val p1 = Person("Abhishek", 29)
    val p2 = Person("Kruti", 17)
    println("${p1.name} can vote ${p1.canVote}")
    println("${p2.name} can vote ${p2.canVote}")

    val student1 = Student("John Doe", 9)
    val student2 = Student("Ivy Fernandez", 12)
    student1.showSchoolName()
    student2.showSchoolName()
    student1.showClassStandard()
    student2.showClassStandard()

    val calc = Calculator()
    println(calc.add(23, 45))
    println(calc.multiply(13, 23))
}

// Class with Primary Constructor
class Automobile(val name: String, val tyres: Int, val maxSeating: Int, hasAirbags: Boolean) {
    //  If you can't define the below property in class then you can't access the parameter hasAirbags through objects because it's not declared with val or var
    val airBagsAvailability = hasAirbags;
    fun drive() {}
    fun applyBrakes() {}
}

// Class without any Constructor.
class Empty {}

// Class with Primary Constructor and Parameter
class Person(nameParam: String, ageParam: Int) {
    val name: String = "$nameParam - Clan"
    val age: Int = ageParam
    val canVote: Boolean = ageParam > 18
}

// Class with Secondary Constructor
class Student(val name: String, val classStandard: Int, val schoolName: String, val availBusService: Boolean) {
    constructor(nameParam: String, classStandardParam: Int) : this(
        nameParam,
        classStandardParam,
        "Mother Mary's English High School",
        false
    )

    fun showSchoolName() {
        println("$name is studying in $schoolName")
    }

    fun showClassStandard() {
        println("$name has in $classStandard standard")
    }
}

// Class with no Constructor but with Properties and Methods
class Calculator {

    //    With the help of lateInit keyword you won't have to define a variable at the time of declaration.
    lateinit var message: String

    fun add(x: Int, y: Int): Int {
        return x + y;
    }

    fun multiply(x: Int, y: Int): Int {
        return x * y;
    }
}