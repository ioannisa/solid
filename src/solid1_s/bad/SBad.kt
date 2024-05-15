package solid1_s.bad

//Single Responsibility Principle (SRP) with OTP Example
fun main() {
    val otp1 = OTPSender()
    otp1.send("123456", "email")
}

class OTPSender() {
    fun send(otp: String, strategy: String) {
        if (isValid(otp, strategy)) {
            println("[S] Submitting OTP -> $otp")
        }
    }

    fun isValid(otp: String, validationType: String): Boolean {
        return when (validationType) {
            "email" -> otp.length == 6 && otp.all { it.isDigit() }
            "phone" -> otp.length == 6 && otp.all { it.isDigit() } && otp.startsWith("123")
            "bank"  ->  otp.length == 8 && otp.all { it.isDigit() } && otp.startsWith("541")
            else -> false
        }
    }
}