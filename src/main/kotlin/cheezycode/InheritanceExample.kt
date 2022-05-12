package cheezycode

fun main() {
    var objBasicPhone = BasicPhone()
//    objBasicPhone.display()
}

open class Phone() {
    init {
        println("Phone constructor is called")
    }

    val name: String = ""
    val type: String = ""
    val volume: Int = 10

    fun makeCall() {}
    fun display() {
        println("You are trying to display")
    }

    fun powerOff() {}
    fun getDeviceInfo() {}
}

// BasicPhone extends Phone
class BasicPhone() : Phone() {
    init {
        println("BasicPhone constructor is called")
    }

    fun getScreenInfo() {}
}

// SmartPhone extends Phone
class SmartPhone() : Phone() {
    init {
        println("Smartphone constructor is called")
    }

    fun playMovie() {}
    fun takePicture() {}
    fun getLocation() {}
}
