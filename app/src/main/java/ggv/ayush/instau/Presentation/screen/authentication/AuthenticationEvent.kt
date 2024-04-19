package ggv.ayush.instau.Presentation.screen.authentication

sealed class AuthenticationEvent {
    object ToggleAuthenticationMode : AuthenticationEvent()

    class EmailChanged(val emailAddress: String) :
        AuthenticationEvent()

    class PasswordChanged(val password: String) :
        AuthenticationEvent()

    class  phoneNumberChanged (val phoneNumber : String) :
        AuthenticationEvent()

    class userNameChanged(val userName : String) :
    AuthenticationEvent()


    object Authenticate: AuthenticationEvent()

    object ErrorDismissed: AuthenticationEvent()

}
