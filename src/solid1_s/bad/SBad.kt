package solid1_s.bad

//Single Responsibility Principle (SRP) with OTP Example
fun main() {
    val otp1 = OTPSender("email")
    otp1.send("123456")
}

class OTPSender(private val strategy: String) {
    fun send(otp: String) {
        if (isValid(otp, strategy)) {
            println("[S] Submitting OTP -> $otp")
        }
    }

    fun isValid(otp: String, validationType: String): Boolean {
        return when (validationType) {
            "email" -> otp.length == 6 && otp.all { it.isDigit() }
            "phone" -> otp.length == 6 && otp.all { it.isDigit() } && otp.startsWith("123")
            "bank"  ->  otp.length == 8 && otp.startsWith("123") && otp.all { it.isDigit() }
            else -> false
        }
    }
}