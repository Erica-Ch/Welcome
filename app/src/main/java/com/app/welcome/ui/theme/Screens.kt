package com.app.welcome.ui.theme

sealed class Screens (val route: String) {
    object SplashScreen : Screens("Splash")
    object WelcomeScreen : Screens("Welcome")
    object JourneyScreen : Screens("Journey")
    object ModuleScreen : Screens("Module")
    object AllModule : Screens("AllModule")

}