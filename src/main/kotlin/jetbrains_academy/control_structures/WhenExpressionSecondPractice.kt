package jetbrains_academy.control_structures

const val GRYFFINDOR = "gryffindor"
const val HUFFLEPUF = "hufflepuff"
const val SLYTHERIN = "slytherin"
const val RAVEN_CLAW = "ravenclaw"
const val BRAVERY = "bravery"
const val LOYALTY = "loyalty"
const val CUNNING = "cunning"
const val INTELLECT = "intellect"
const val INVALID_HOUSE = "not a valid house"
fun main() {
    val character = when (readln()) {
        GRYFFINDOR -> BRAVERY
        HUFFLEPUF -> LOYALTY
        SLYTHERIN -> CUNNING
        RAVEN_CLAW -> INTELLECT
        else -> INVALID_HOUSE
    }
    println(character)
}