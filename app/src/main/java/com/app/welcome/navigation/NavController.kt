package com.app.welcome.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.app.welcome.JourneyScreen
import com.app.welcome.ModuleScreen
import com.app.welcome.SplashScreen
import com.app.welcome.WelcomeScreen
import com.app.welcome.ui.theme.Screens

@Composable
fun  setUpNavController(controller:NavHostController){
    
  NavHost(navController = controller, startDestination = Screens.SplashScreen.route){

      composable(Screens.SplashScreen.route){
          SplashScreen(navController = controller)

      }
      composable(Screens.WelcomeScreen.route){
          //show screen
          WelcomeScreen(navController = controller)
      }

      composable(Screens.JourneyScreen.route){
          JourneyScreen(navController = controller)
       }

      composable(Screens.ModuleScreen.route){
          ModuleScreen(navController = controller)
      }
  }
}
