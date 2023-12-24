package cheezycode

fun main() {
    val building1 = Building("pleasant park ", -1)
    building1.location = "Mira Road"
    println(building1.name)
    println(building1.floor)
    println(building1.location)
}

class Building(nameParam: String, floorParam: Int) {
    var name: String = nameParam
        get() {
            return field.toUpperCase().trim()
        }
        set(value) {
            field = value.trim()
        }
    var floor: Int = floorParam
        get() {
            return field.toInt()
        }
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("The floor value can't be negative")
            }
        }
    var location: String = ""
        get() = field
        set(value) {
            field = value
        }
}