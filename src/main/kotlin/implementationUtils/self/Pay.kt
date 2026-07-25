package implementationUtils.self

interface Pay {

    val discountPercentage: Double

    fun makePayment()

    fun calculatePrice(quantity: Int, price: Double): Double {
        return quantity * price
    }
}