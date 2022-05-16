package com.app.welcomescreen

/*
Ngonidzaishe Erica Chipato
218327315
Practical 01
 */


import android.app.Dialog
import android.content.Intent
import android.graphics.fonts.FontStyle
import androidx.compose.material.AlertDialog
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.app.welcomescreen.ui.theme.Teal200
import androidx.compose.material.ButtonDefaults.buttonColors as buttonColors1



class MainActivity(navController: NavHostController) : ComponentActivity() {
    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MaterialTheme {

                navController = rememberNavController()
                SetupNavGraph(navController = navController)

            TextView("To My Jetpack Compose Journey")
            Button("Info")

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {



                    }
                }
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom
            ) {

            Box()

            {
                TextButton(
                    onClick = {val intent= Intent(this@MainActivity ,Journey::class.java)
                        startActivity(intent) },
                    border = BorderStroke(5.dp, Color.White),
                    contentPadding = PaddingValues(16.dp),
                    modifier = Modifier
                        .size(width = 300.dp, height = 50.dp)
                        .background(Color.Blue),
                ) {
                   Text(text = "Start Journey", color = Color.Black)
                }
            }}
        }
    }



@Composable
fun TextView(name: String) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

            Text(text = "Welcome, $name!",
                fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                color = Color.Blue)



    }

    }

//@Preview(showBackground = true)
@Composable
fun PreviewTextView() {
    TextView("To My Jetpack Compose Journey")
}

@Composable
fun Button (text: String) {
    val openDialog = remember { mutableStateOf(false) }
    val backgroundColor = remember {
        mutableStateOf(Color(0xFF03DAC5))
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Button(
            onClick = {
                openDialog.value = true
            },
            modifier = Modifier.padding(16.dp)
        ) {
            Icon(
                Icons.Filled.Info,
                contentDescription = "Info Button",
                tint = Color.DarkGray,
                modifier = Modifier.size(50.dp)
            )
            Text(text = "Info")
        }
        if (openDialog.value){
            AlertDialog(
                onDismissRequest = {openDialog.value = false},
                title = {Text(text = "My Journey")},
                text = {Text (
                       text = "I anticipate to learn  on how I can become a better developer using Jetpack compose. " +
                               "Discovery ways to use material design is something I have always wanted to learn "
                        )},
                confirmButton = {
                    Button(onClick = {
                        openDialog.value = false
                        backgroundColor.value = Color.Magenta
                    }) {
                        Text(text = "Confirm")
                    }
                },
                dismissButton = {
                    Button(onClick = {
                        openDialog.value = false
                    },
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.Magenta,
                            contentColor(Color.White )
                        )
                    ){
                        Text(text= "Dismiss")
                    }
                }
            )

        }

    }
}}

fun contentColor(white: Color): Color {
    TODO("Not yet implemented")
}


















