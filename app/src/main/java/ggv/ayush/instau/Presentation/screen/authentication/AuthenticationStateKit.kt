package ggv.ayush.instau.Presentation.screen.authentication

import androidx.annotation.StringRes
import ggv.ayush.instau.R

data class AuthenticationState(
    val userName: String? = null,
    val phoneNumber: String? = null,

    val authenticationMode: AuthenticationMode = AuthenticationMode.SIGN_IN,
    val email: String? = null,
    val password: String? = null,
    val passwordRequirements: List<PasswordRequirements> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null

) {
    fun isFormValid(): Boolean {
        return password?.isNotEmpty() == true
                && email?.isNotEmpty() == true
                && userName?.isNotEmpty() == true
                && phoneNumber?.isNotEmpty() == true
                && (authenticationMode == AuthenticationMode.SIGN_IN
                || passwordRequirements.containsAll(
            PasswordRequirements.values().toList()
        )
                )
    }
}

enum class PasswordRequirements(@StringRes val label: Int) {

    CAPITAL_LETTER(R.string.password_requirement_capital), NUMBER(R.string.password_requirement_digit), EIGHT_CHARACTERS(
        R.string.password_requirement_characters
    )
}

enum class AuthenticationMode {
    SIGN_UP, SIGN_IN
}