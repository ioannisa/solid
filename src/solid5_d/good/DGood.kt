package solid5_d.good

// Dependency Inversion Principle (DIP)
fun main() {
    val payPalPayment: Payment = PayPalPayment()
    val stripePayment: Payment = StripePayment()

    val paymentProcessor1 = PaymentProcessor(payPalPayment)
    paymentProcessor1.processPayment(100.0)

    val paymentProcessor2 = PaymentProcessor(stripePayment)
    paymentProcessor2.processPayment(200.0)
}

interface Payment {
    fun pay(amount: Double)
}

class PaymentProcessor(private var paymentMethod: Payment) {
    fun processPayment(amount: Double) {
        paymentMethod.pay(amount)
    }
}

class PayPalPayment : Payment {
    override fun pay(amount: Double) {
        println("[D] Processing PayPal payment of $$amount")
    }
}

class StripePayment : Payment {
    override fun pay(amount: Double) {
        println("[D] Processing Stripe payment of $$amount")
    }
}