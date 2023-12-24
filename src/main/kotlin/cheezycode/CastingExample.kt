package cheezycode

fun main() {
    val circle: CircleCastingExample = CircleCastingExample(9.0)
    val square: SquareCastingExample = SquareCastingExample(3.4)
    val player: PlayerCastingExample = PlayerCastingExample("Steve Smith")
    val objArray: Array<DraggingCastingExample> = arrayOf(circle, player, square)
    println("Using when to access the objects")
    for (obj in objArray) {
        when (obj) {
            square -> println(square.area())
            circle -> println(circle.area())
            player -> player.greet()
            else -> return
        }
    }
    println("Using if else to access the objects")
    for (obj in objArray) {
//        This is an example of Type Casting
        if (obj is CircleCastingExample) {
//            This is an example of Smart Casting, here the compiler automatically detects the methods and properties of classes
            println(obj.area())
        } else if (obj is SquareCastingExample) {
            println(obj.area())
        } else {
            (obj as PlayerCastingExample).greet()
        }
    }
}

interface DraggingCastingExample {
    fun drag()
}

abstract class ShapeCastingExample : DraggingCastingExample {
    abstract fun area(): Double
}

class CircleCastingExample(private val radius: Double) : ShapeCastingExample() {
    override fun area(): Double = radius * radius
    override fun drag() {
        println("Circle is dragging")
    }
}

class SquareCastingExample(private val side: Double) : ShapeCastingExample() {
    override fun area(): Double = side * side
    override fun drag() {
        println("Square is dragging")
    }
}

class TriangleCastingExample(private val base: Double, private val height: Double) : ShapeCastingExample() {
    override fun area(): Double = 0.5 * base * height
    override fun drag() {
        println("Triangle is dragging")
    }
}

class PlayerCastingExample(private val name: String) : DraggingCastingExample {
    fun greet() {
        println("Welcome to the team, $name")
    }

    override fun drag() {
        println("$name is dragging")
    }
}