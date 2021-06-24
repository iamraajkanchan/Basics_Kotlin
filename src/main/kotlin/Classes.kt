fun main() {
    val mustang = Car("Mustang", "Petrol", 100)
    val beetle = Car(name = "Volkswagen Beetle", type = "Petrol", kmRan = 300)
    println(mustang.name)
    println(beetle.type)
    mustang.drive()
    beetle.applyBrake()
}

class Car(val name: String, val type: String, val kmRan: Int) {
    fun drive() {
        println("$name is driving")
    }

    fun applyBrake() {
        println("$name applied a brake")
    }
}