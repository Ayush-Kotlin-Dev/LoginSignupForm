package ggv.ayush.instau.util.common

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import ggv.ayush.instau.ui.theme.Purple700


@Composable
fun StatusbarColor() {
    val systemUiController = rememberSystemUiController()
    val isDarkTheme = isSystemInDarkTheme()
    systemUiController.setStatusBarColor(
        color = if (isSystemInDarkTheme()) Color.Black else Purple700
    )
    SideEffect {
        systemUiController.setSystemBarsColor(
            color = if (isDarkTheme) Color.Black else Purple700,
            darkIcons = if (isDarkTheme) false else true )
    }
}

@Composable
fun SystemBarsColor() {
    val systemUiController = rememberSystemUiController()

    systemUiController.setSystemBarsColor(
        color = if (isSystemInDarkTheme()) Color.Black else Purple700
    )
}
