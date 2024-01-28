package cheezycode

fun main() {
    val animal: String = "Dog"
    when (animal) {
        "Dog" -> println("This is a Dog")
        "Cat" -> println("This is a Cat")
        "Cow" -> println("This is a Cow")
        "Donkey" -> println("This is a Donkey")
        else -> "This is another animal"
    }

    val bird: String = "Sparrow"
    val birdResult = when (bird) {
        "Sparrow" -> "This is a Sparrow"
        "Eagle" -> "This is an Eagle"
        "Vulture" -> "This is a Vulture"
        "Parrot" -> "This is a Parrot"
        else -> "This is another bird"
    }
    println(birdResult)

    val number: Int = 13
    val numberResult = when (number) {
        11 -> "Eleven"
        12 -> "Twelve"
        in 13..19 -> "Teen"
        else -> "This is another number"
    }
    println(numberResult)
}