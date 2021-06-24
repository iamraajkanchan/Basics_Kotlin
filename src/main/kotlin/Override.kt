fun main() {
    var mobileObj = Mobile("Basic Phone")
    mobileObj.name = "Panasonic"
    mobileObj.size = 4
    mobileObj.display()
    println(mobileObj.toString())

    var onePlusObj = OnePlus("Smart Phone")
//    "OnePlus 6".also { onePlusObj.name = it }
    onePlusObj.name = "OnePlus 7"
    6.also { onePlusObj.size = it }
    onePlusObj.display()
    println(onePlusObj.toString())
}

open class Mobile(open val type: String) {
    open var name: String = ""
        set(value) {
            field = value.trim()
        }
    open var size: Int = 5
        set(value) {
            field = value
        }

    fun makeCall() = println("Calling from mobile")
    fun powerOff() = println("Shutting Down")
    open fun display() = println("Single Mobile Display")
    override fun toString(): String {
        return "Mobile(type='$type', name='$name', size=$size)"
    }

}

class OnePlus(typeParam: String) : Mobile(typeParam) {
    override var name: String = ""
        get() = field.trim()
        set(value) {
            field = value.trim()
        }
    override var size: Int = 0
        get() = field
        set(value) {
            field = value.toInt()
        }

    override var type: String = typeParam

    override fun display() {
//        super.display()
//        println()
    }

    override fun toString(): String {
        return "OnePlus(name= '$name', size= $size, type= $type)"
    }
}