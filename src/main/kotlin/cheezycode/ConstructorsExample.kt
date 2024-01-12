package cheezycode

import java.io.InvalidObjectException

fun main() {

    val car = Automobile(name = "Mercedes", 4, 5, true)
    println("${car.name} has airbags ${car.airBagsAvailability}")

    val p1 = Person("Abhishek", 29)
    val p2 = Person("Kruti", 17)
    println("${p1.name} can vote ${p1.canVote}")
    println("${p2.name} can vote ${p2.canVote}")

    val calc = Calculator()
    println(calc.add(23, 45))
    println(calc.multiply(13, 23))

    val student1 = Student("John Doe", 9)
    val student2 = Student("Ivy Fernandez", 12)
    val student3 = Student("Winston Churchill", 3, "Boston School of London", true)
    student1.showSchoolName()
    student2.showSchoolName()
    student1.showClassStandard()
    student2.showClassStandard()
    if (student3.isUsingBusService()) {
        println("Student 3 is using Bus Service")
    } else {
        println("Student 3 is not using Bus Service")
    }
    val firstTeacher = Teacher(24)
    val secondTeacher = Teacher("Jack Sparrow")
    val thirdTeacher = Teacher(12)
    firstTeacher.showDetails()
    secondTeacher.showDetails()
    thirdTeacher.showDetails()
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
class Student(
    private val name: String,
    private val classStandard: Int,
    private val schoolName: String,
    private val availBusService: Boolean
) {
    constructor(name: String, classStandard: Int) : this(
        name,
        classStandard,
        "Mother Mary's English High School",
        false
    )

    fun showSchoolName() {
        println("$name is studying in $schoolName")
    }

    fun showClassStandard() {
        println("$name has in $classStandard standard")
    }

    fun isUsingBusService(): Boolean {
        return availBusService
    }
}

// Class with no Constructor but with Properties and Methods
class Calculator {

    //    With the help of lateInit keyword you won't have to define a variable at the time of declaration.
    private lateinit var message: String

    fun add(x: Int, y: Int): Int {
        return x + y;
    }

    fun multiply(x: Int, y: Int): Int {
        return x * y;
    }
}

class Teacher(private val name: String) {
    private var age: Int? = null

    constructor(age: Int) : this("John Doe") {
        if (age < 18) {
            throw IllegalArgumentException("Not a valid age for Teacher")
        } else {
            this.age = age;
        }
    }

    fun setAge(age: Int) {
        this.age = age;
    }

    fun showDetails() {
        println("Teacher Name : $name, Teacher Age: ${age ?: 18}")
    }

}