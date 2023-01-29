package com.app.welcome


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.app.welcome.navigation.showBars
import com.app.welcome.ui.theme.Screens



    @Composable
    fun WelcomeScreen(navController: NavController) {
        showBars(flag = true)


        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.TopCenter
        ) {
            Image(
                modifier = Modifier
                    .size(350.dp)
                    .clip(CircleShape),
                painter = painterResource(id = R.drawable.hat),
                contentDescription = "Circular Img",
            )
        }

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "\n \n \n Welcome to My Jetpack " +" \n Compose Journey\n",
                    style = TextStyle(),
                    modifier = Modifier.padding(5.dp),
                    fontSize = 30.sp
                )



                // Alert Dialog
                val openAlertDialog = remember { mutableStateOf(false) }

                Button(onClick = {
                    openAlertDialog.value = true

                }) {
                    Icon(
                        imageVector = Icons.Filled.Info,
                        contentDescription = "Info icon",
                        Modifier.padding(end = 10.dp),
                        Color.Yellow
                    )
                    Text(text = "info")
                }


                if (openAlertDialog.value){
                    AlertDialog(onDismissRequest = {
                        openAlertDialog.value = false
                    },
                    title = {
                        Text(text = " My Journey")
                    },
                    text = {
                        Text(text = " The previous year we  learned how to create " +
                                    "mobile applications using Java. Although it was daunting" +
                                    " at first to use Kotlin this year it has been an exciting" +
                                    " journey. Having learnt that Jetpack Compose is used to" +
                                    " build faster better applications. I am able to create my own" +
                                    " app and learn along the way. Using Material" +
                                    " design in my app has given me a new perspective " +
                                    " on design. Lastly, I learned errors are not final it's part"
                                    + " of my learning journey.")
                    },
                    buttons = {
                        Row(
                            modifier = Modifier
                                .padding(all = 8.dp)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ){
                            Button(onClick = {openAlertDialog.value= false}
                            ) {
                                Text(text = "Dismiss")
                            }
                        }

                    }
                    )
                    }



                    }



            }


            // Journey button
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.BottomEnd
            ) {
                Column(
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.End,
                    modifier = Modifier
                        .fillMaxSize()
                ) {


                    Button(onClick = {
                        navController.navigate(Screens.JourneyScreen.route)
                    }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowForward,
                            contentDescription = "start icon",
                            Modifier.padding(end = 10.dp),
                            Color.Green
                        )
                        Text(text = "Start Journey")
                    }
                }
            }
        }








@SuppressLint("ComposableNaming")
@Preview(showBackground = true)
       @Composable
        private fun   showWelcome() {
            WelcomeScreen(rememberNavController())
        }








