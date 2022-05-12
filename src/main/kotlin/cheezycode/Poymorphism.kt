package cheezycode

fun main() {
    var circle: Shape = Circle(4.5)
    var square: Shape = Square(3.2)
    circle.area()
    square.area()
    var shapes = arrayOf(Circle(3.4), Square(4.8), Circle(9.5), Triangle(3.2, 7.4))
    calculateAreas(shapes)

    var newCircle: Circle = Circle(3.3)
    printArea(newCircle)
// printArea expects the object of a Shape but Circle is a child class of Shape so with the help of Polymorphism such invocations are allowed
}

fun printArea(shape: Shape) {
    shape.area()
}

fun calculateAreas(shapes: Array<Shape>) {
    for (shape in shapes) {
        shape.area()
    }
}

open class Shape() {
    open fun area() {
        println("Area of a Shape")
    }
}

class Circle(private val radius: Double) : Shape() {
    private val type: String = "Circle"
    override fun area() {
        println("Area of $type is ${Math.PI * radius * radius}")
    }
}

class Square(private val side: Double) : Shape() {
    private val type: String = "Square"
    override fun area() {
        println("Area of $type is ${side * side}")
    }
}

class Triangle(private val base: Double, private val height: Double) : Shape() {
    private val type: String = "Triangle"
    override fun area() {
        println("Area of $type is ${0.5 * base * height}")
    }
}

