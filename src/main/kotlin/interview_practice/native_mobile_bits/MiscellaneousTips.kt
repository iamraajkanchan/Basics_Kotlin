package interview_practice.native_mobile_bits
class MiscellaneousTips {

    init {
        println("MiscellaneousTips :: First init block")
        simulateRemoveSurroundingMethod()
    }

    init {
        println("MiscellaneousTips :: Second init block")
        simulateRemoveSurroundingMethod()
    }
    private fun simulateRemoveSurroundingMethod() {
        val chinky = "--Chinky--"
        println(chinky)
        println(chinky.removeSurrounding("--"))
        val minky = "--Minky+-+"
        println(minky)
        println(minky.removeSurrounding("--","+-+"))
    }
}