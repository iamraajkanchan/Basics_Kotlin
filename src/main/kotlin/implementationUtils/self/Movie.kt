package implementationUtils.self

class Movie(private val name: String, private val quantity: Int, private val price: Double) : Pay {
    override val discountPercentage: Double get() = 12.4

    override fun makePayment() {
        TODO("Not yet implemented")
    }

    override fun calculatePrice(quantity: Int, price: Double): Double {
        val calculatedPrice = super.calculatePrice(quantity, price)
        return if (quantity <= 0) {
            calculatedPrice
        } else {
            price
        }
    }
}