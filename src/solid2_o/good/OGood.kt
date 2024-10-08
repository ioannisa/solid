package solid2_o.good

//Open-Close Principle with OTP Example
fun main() {
    //val validator: OTPValidator = OTPEmailValidator()
    //val otp = OTPSender(validator)
    val otp = OTPSender()
    otp.send("123456", OTPEmailValidator())
}


class OTPSender() {
    fun send(otp: String, otpValidator: OTPValidator) {
        if (otpValidator.isValid(otp)) {
            println("[O] Submitting OTP -> $otp")
        }
    }
}



interface OTPValidator {
    fun isValid(otp: String): Boolean
}

class OTPEmailValidator : OTPValidator {
    override fun isValid(otp: String): Boolean {
        return otp.length == 6 && otp.all { it.isDigit() }
    }
}

class OTPPhoneValidator : OTPValidator {
    override fun isValid(otp: String): Boolean {
        return otp.length == 6 && otp.all { it.isDigit() } && otp.startsWith("123")
    }
}

class OTPBankValidator : OTPValidator {
    override fun isValid(otp: String): Boolean {
        return otp.length == 8 && otp.startsWith("123") && otp.all { it.isDigit() }
    }
}