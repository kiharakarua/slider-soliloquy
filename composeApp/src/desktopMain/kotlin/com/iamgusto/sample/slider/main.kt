package com.iamgusto.sample.slider

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "SliderProject",
    ) {
        App()
    }
}