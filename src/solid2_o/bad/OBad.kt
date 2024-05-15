package solid2_o.bad

//Open-Close Principle with OTP Example
fun main() {


    val otp1 = OTPSender(OTPValidator())
    otp1.send("123456", "email")
}


class OTPSender(private val otpValidator: OTPValidator) {
    fun send(otp: String, validationType: String) {
        if (otpValidator.isValid(otp, validationType)) {
            println("[O] Submitting OTP -> $otp")
        }
    }
}

class OTPValidator {
    fun isValid(otp: String, validationType: String): Boolean {
        return when (validationType) {
            "email" -> otp.length == 6 && otp.all { it.isDigit() }
            "phone" -> otp.length == 6 && otp.all { it.isDigit() } && otp.startsWith("123")
            "bank"  ->  otp.length == 8 && otp.startsWith("123") && otp.all { it.isDigit() }
            else -> false
        }
    }
}
