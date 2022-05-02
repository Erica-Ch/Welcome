package com.app.welcomescreen
/*
Ngonidzaishe Erica Chipato
218327315
Practical 02
 */

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.TextButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.app.welcomescreen.ui.theme.WelcomeScreenTheme
import androidx.compose.material.Text as Text1

class Journey : ComponentActivity() {
    lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WelcomeScreenTheme {

                navController = rememberNavController()
                SetupNavGraph(navController = navController)


                Column(

                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize().background(Color.Cyan)
                ) {


                    Text1(
                        text = "Name: Ngonidzaishe Erica Chipato",
                        fontSize = 22.sp,
                        color = Color.White
                    )
                    Text1(
                        text = "Course:Application Development",
                        fontSize = 22.sp,
                        color = Color.White
                    )
                    Text1(
                        text = "Department:Information Technology",
                        fontSize = 22.sp,
                        color = Color.White
                    )
                    Text1(text = "Student Number:218327315", fontSize = 22.sp, color = Color.White)

                    Box()

                    {
                        TextButton(
                            onClick = {navController.navigate(Screen.Mod.route) },
                            border = BorderStroke(5.dp, Color.White),
                            contentPadding = PaddingValues(16.dp),
                            modifier =Modifier.size(width = 300.dp, height = 50.dp)
                                .background(Color.Green),
                        ) {
                            Text1(text = "Current module", color = Color.Black)
                        }
                    }
                }

                Column(

                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = CenterHorizontally,
                    modifier = Modifier.fillMaxSize().padding(all = 9.dp)
                ) {
                    Box()

                    {
                        TextButton(
                            onClick = {
                                val intent = Intent(this@Journey, MainActivity::class.java)
                                startActivity(intent)
                            },
                            border = BorderStroke(5.dp, Color.White),
                            contentPadding = PaddingValues(16.dp),
                            modifier = Modifier.size(width = 300.dp, height = 50.dp)
                                .background(Color.Gray),
                        ) {
                            Text1(text = "Back", color = Color.Black)
                        }

                    }
                }
            }
        }
    }

    //private fun Intent(journey: Journey, java: Uri?): Any {


    //}
    
}

