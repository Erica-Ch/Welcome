package com.app.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.app.welcome.navigation.showBars
import com.app.welcome.ui.theme.Screens
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController){
    showBars(flag = false)
    LaunchedEffect(key1 = true){
        delay(2500)
        navController.navigate(Screens.WelcomeScreen.route){
            popUpTo(0)
        }

    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

        Image(
            modifier = Modifier
                .size(300.dp),
              painter = painterResource(id = R.drawable.jet),
              contentDescription = "logo" )

        Spacer(modifier = Modifier.width(4.dp))


        Text(text = "N.E.C",
             fontSize = 30.sp)

    }

    }
}

@Preview(showBackground = true)
@Composable
private fun showSplash(){
    SplashScreen(rememberNavController())

}
