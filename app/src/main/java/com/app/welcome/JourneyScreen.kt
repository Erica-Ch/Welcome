package com.app.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.app.welcome.navigation.showBars
import com.app.welcome.ui.theme.Screens


@Composable
fun JourneyScreen(navController: NavController) {
    showBars(flag = true)


        //Back Btn
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.TopEnd
        ) {

            Button(onClick = {

                navController.navigate(Screens.WelcomeScreen.route)
            }) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "Back icon",
                    Modifier.padding(end = 10.dp),
                    Color.Red
                )

                Text(text = "Back")
            }
        }

        //Header
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "Details", color = Color.Black, fontSize = 29.sp,
                    fontFamily = FontFamily.SansSerif,
                    style = TextStyle(fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(top = 30.dp, start = 40.dp)
                )
            }
        }

        // Circle Img
        Box() {
            Image(
                modifier = Modifier
                    .size(400.dp)
                    .clip(androidx.compose.foundation.shape.CircleShape),
                painter = painterResource(id = R.drawable.girl),
                contentDescription = "Circular Img"
            )
        }

        // List details
    Box(
        contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ){
            Text(
                buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(color = Color.Cyan)) {
                        withStyle(
                            style = SpanStyle(fontWeight = FontWeight.Medium,
                            color = Color.Black,
                            fontSize = 25.sp)
                        ) {
                            append("\n \n \n \n \n \n \nName:\n")
                        }
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Normal,
                                color = Color.Black,
                                fontSize = 25.sp
                            )
                        ) {
                            append("\n Ngonidzaishe Erica Chipato\n")
                        }

                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.SemiBold,
                                color = Color.Black,
                                fontSize = 25.sp
                            )
                        ) {
                            append("\n Course:\n ")
                        }

                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Normal,
                                color = Color.Black,
                                fontSize = 25.sp
                            )
                        ) {
                            append("\n Application Development\n")
                        }
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.SemiBold,
                                color = Color.Black,
                                fontSize = 25.sp
                            )
                        ) {
                            append("\n Department:\n")
                        }

                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Normal,
                                color = Color.Black,
                                fontSize = 25.sp
                            )
                        ) {
                            append("\n Information Technology\n")
                        }
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.SemiBold,
                                color = Color.Black,
                                fontSize = 25.sp
                            )
                        ) {
                            append("\nStudentNumber:\n")
                        }
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Normal,
                                color = Color.Black,
                                fontSize = 25.sp
                            )
                        ) {
                            append("\n 218327315\n")
                        }
                    }
                }
            )
        }
    }



        //Current modules btn
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomEnd
        ) {

            Button(
                onClick = { navController.navigate(Screens.ModuleScreen.route) },
                colors = ButtonDefaults.buttonColors(Color.Blue)

            ) {

                Icon(
                    imageVector = Icons.Filled.MenuBook,
                    contentDescription = "Book icon",
                    Modifier.padding(end = 10.dp),
                    Color.Yellow
                )
                Text(text = "Current Modules",
                color = Color.White)
            }
        }
}









@Preview(showBackground = true)
@Composable
private fun showJourney(){
    JourneyScreen(rememberNavController())

}