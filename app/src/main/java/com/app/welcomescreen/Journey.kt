package com.app.welcomescreen

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.welcomescreen.ui.theme.WelcomeScreenTheme
import com.google.android.filament.Box
import java.lang.reflect.Modifier
import java.nio.file.Files.size
import org.w3c.dom.Text as Text1

class Journey : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WelcomeScreenTheme {

                Column(

                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Layout.Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize().background(Color.Purple)
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
                            onClick = { },
                            border = BorderStroke(5.dp, Color.White),
                            contentPadding = PaddingValues(16.dp),
                            modifier = Modifier.size(width = 300.dp, height = 50.dp)
                                .background(Color.Orange),
                        ) {
                            Text1(text = "Current module", color = Color.Black)
                        }
                    }
                }

                Column(

                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.CenterHorizontally,
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
                                .background(Color.Pink),
                        ) {
                            Text1(text = "Back", color = Color.Black)
                        }

                    }
                }
            }
        }
    }

    private fun Intent(journey: Journey, java: Uri?): Any {

    
}
    
}

