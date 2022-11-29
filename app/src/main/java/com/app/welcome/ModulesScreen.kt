package com.app.welcome

import android.app.Activity
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.app.welcome.data.Modu
import com.app.welcome.model.AllModules
import com.app.welcome.model.ModuleCard
import com.app.welcome.model.modules
import com.app.welcome.navigation.showBars
import com.app.welcome.ui.theme.Screens




@Composable
fun ModuleScreen(navController: NavController) {
    showBars(flag = true)



    // Call All Modules
    AllModules(modules)


    @Composable
    fun AllModules(modList: List<Modu>) {
        var scrollstate = rememberScrollState()
        Box() {
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .verticalScroll(scrollstate),
                contentPadding = PaddingValues(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(vertical = 25.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Text(
                                text = "Current Modules", color = Color.Black, fontSize = 29.sp,
                                fontFamily = FontFamily.SansSerif,
                                style = TextStyle(fontWeight = FontWeight.Bold),
                                modifier = Modifier.padding(top = 40.dp, start = 40.dp)
                            )
                        }
                        //Lists
                        this@LazyColumn.items(modList) { module ->
                            ModuleCard(module.name, module.type, module.duration, module.imageRes)

                        }
                    }


                }
            }
        }

    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopEnd
    ) {

        Button(onClick = {
            navController.navigate(Screens.JourneyScreen.route)
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


    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomEnd
    ) {

        val openAlertDialog = remember { mutableStateOf(false) }
        val activity = (LocalContext.current as? Activity)

        Button(onClick = {
            openAlertDialog.value = true



        }) {
            Icon(
                imageVector = Icons.Filled.ExitToApp,
                contentDescription = "Exit icon",
                Modifier.padding(end = 10.dp),
                Color.Yellow
            )
            Text(
                text = "Goodbye",
                color = Color.White
            )
        }

        if (openAlertDialog.value){
            AlertDialog(onDismissRequest = {
                openAlertDialog.value = false
            },
                title = {
                    Text(text = " Leaving Now?")
                },
                text = {
                    Text(text = " This action cannot be undone!\n" +
                            "Are you sure you want to leave the app?")
                },
                confirmButton = {
                    Button(
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green),
                        onClick = {
                        openAlertDialog.value = false;
                        activity?.finish()

                    }) {
                        Text(
                            "Yes",
                            color = Color.White
                        )
                    }
                },
                dismissButton = {
                    Button(
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
                        onClick = {
                            openAlertDialog.value = false

                        }) {
                        Text(
                            text = "No",
                            color = Color.White
                        )
                    }
                })


        }



    }



}






@Preview(showBackground = true)
@Composable
private fun showModule(){
    ModuleScreen(rememberNavController())
}







