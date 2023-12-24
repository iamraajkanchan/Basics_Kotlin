package cheezycode
fun main() {
    val x: Int = 20;
    val y: Int = 21;
    val result = when {
        x < y -> {
            "X is less than Y"
        }
        x > y -> (
                "X is greater than Y"
                )
        else -> {
            "X is equal to Y"
        }
    }

    println(result)

    val number: Int = 20
    val modResult = when {
        number % 2 == 0 -> "Number is even"
        else -> "Number is odd"
    }
    println(modResult)

    val gender: String = "Male"
    val userGender = when (gender) {
        "Male" -> "User is a male"
        else -> "User is a female"
    }
    println(userGender)

}