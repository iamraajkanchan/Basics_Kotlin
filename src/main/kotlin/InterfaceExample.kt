// This is an example of Interface, Polymorphism and Inheritance
fun main() {
    dragObjects(
        arrayOf(
            CircleInterfaceExample(4.9),
            SquareInterfaceExample(3.5),
            TriangleInterfaceExample(2.6, 8.4),
            Player("Christiano Ronaldo")
        )
    )
}

fun dragObjects(draggableObjects: Array<Dragging>) {
    for (draggable in draggableObjects) {
        draggable.drag()
    }
}


// Through interface, we can group objects based on their behaviour rather than their types (what they are).
// Interface can have abstract and concrete methods
// Interface can implement other interfaces and one class can implement multiple interfaces but classes can have only one superclass (abstract or regular).
interface Dragging {
    fun drag()
}

interface Cloning {
    fun clone()
}

abstract class ShapeInterfaceExample : Dragging, Cloning {
    abstract fun area(): Double
}

class CircleInterfaceExample(private val radius: Double) : ShapeInterfaceExample() {
    override fun area(): Double = radius * radius
    override fun drag() {
        println("Circle is dragging")
    }

    override fun clone() {
        TODO("Not yet implemented")
    }
}

class SquareInterfaceExample(private val side: Double) : ShapeInterfaceExample() {
    override fun area(): Double = side * side
    override fun drag() {
        println("Square is dragging")
    }

    override fun clone() {
        TODO("Not yet implemented")
    }
}

class TriangleInterfaceExample(private val base: Double, private val height: Double) : ShapeInterfaceExample() {
    override fun area(): Double = 0.5 * base * height
    override fun drag() {
        println("Triangle is dragging")
    }

    override fun clone() {
        TODO("Not yet implemented")
    }
}

class Player(private val name: String) : Dragging, Cloning {
    override fun drag() {
        println("$name is dragging")
    }

    override fun clone() {
        TODO("Not yet implemented")
    }
}