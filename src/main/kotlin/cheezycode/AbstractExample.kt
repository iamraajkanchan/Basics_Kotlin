package cheezycode

fun main() {
    val typeAdobeFont: AdobeFont = AdobeFont("Adobe Lucinda")
    println(typeAdobeFont.returnName())
    typeAdobeFont.displaySource()
}

// Abstract Class can't have an object
// Abstract Class may or may not have abstract properties and methods
// If a class has abstract methods or properties than the class must be abstract
abstract class Font() {
    abstract val name: String
    abstract fun returnName(): String // Abstract methods can't have a body and is by default declared by open keyword.

    // This is a final concrete method which cannot be overridden by the child class.
    fun displaySource() {
        println("This Font is Used In AGS Transact Technologies LTD")
    }
}

class AdobeFont(fontNameParam: String) : Font() {
    override val name: String = fontNameParam

    override fun returnName(): String {
        return name
    }
}
