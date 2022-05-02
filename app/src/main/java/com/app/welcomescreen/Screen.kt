package com.app.welcomescreen

/*
Ngonidzaishe Erica Chipato
218327315
Practical 03
 */
sealed class Screen (val route : String){
    object Main:Screen(route = "main_screen")
    object Journ : Screen(route = "journey_screen")
    object Mod : Screen(route = "module_screen")
}
