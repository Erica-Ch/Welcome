package com.app.welcomescreen

/*
Ngonidzaishe Erica Chipato
218327315
Practical 03
 */
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun SetupNavGraph(
    navController : NavHostController

){
    NavHost(
        navController = navController,
        startDestination = Screen.Main.route
    ){
    composable(
        route = Screen.Main.route
    ){
        MainActivity(navController = navController)
    }
        composable(
            route = Screen.Journ.route
        ){
            Journey(navController = navController)
        }

        composable(
            route = Screen.Mod.route
        ){
            ModuleActivity(navController = navController)
        }
    }
}