package solid5_d.good

// Dependency Inversion Principle (DIP)
fun main() {
    val paymentProcessor1 = PaymentProcessor(PayPalPayment())
    paymentProcessor1.processPayment(100.0)

    val paymentProcessor2 = PaymentProcessor(StripePayment())
    paymentProcessor2.processPayment(200.0)
}

class PaymentProcessor(private var paymentMethod: Payment) {
    fun processPayment(amount: Double) {
        paymentMethod.pay(amount)
    }
}

interface Payment {
    fun pay(amount: Double)
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