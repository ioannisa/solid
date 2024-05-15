package solid5_d.bad

// Dependency Inversion Principle (DIP)
fun main() {
    val paymentProcessor = PaymentProcessor(PayPalPayment())
    paymentProcessor.processPayment(100.0)
}

class PaymentProcessor(private val payment: PayPalPayment) {
    fun processPayment(amount: Double) {
        payment.pay(amount)
    }
}

class PayPalPayment {
    fun pay(amount: Double) {
        println("[D] Processing PayPal payment of $$amount")
    }
}