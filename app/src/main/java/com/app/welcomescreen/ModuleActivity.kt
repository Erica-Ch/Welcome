package com.app.welcomescreen
/*
Ngonidzaishe Erica Chipato
218327315
Practical 03
 */

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.AlertDialog
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


class ModuleActivity(navController: NavHostController) : AppCompatActivity() {
    lateinit var navController: NavHostController
    private val moduleView: ModuleView by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {

                val moduleList = moduleView.modulesList.value
                SetModuleLists(moduleList = moduleList!!, c = this)
                navController = rememberNavController()
                SetupNavGraph(navController = navController)


                Column(

                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize().padding(all = 9.dp)
                ) {
                    Box()

                    {
                        TextButton(
                            onClick = { navController.navigate(Screen.Journ.route)},
                            border = BorderStroke(5.dp, Color.White),
                            contentPadding = PaddingValues(16.dp),
                            modifier = Modifier.size(width = 300.dp, height = 50.dp)
                                .background(Color.Green),
                        ) {
                            Text(text = "Back", color = Color.Black)
                        }


                    }
                    Box()

                    {
                        TextButton(
                            onClick = { navController.navigate(Screen.Journ.route)},
                            border = BorderStroke(5.dp, Color.White),
                            contentPadding = PaddingValues(16.dp),
                            modifier = Modifier.size(width = 300.dp, height = 50.dp)
                                .background(Color.Green),
                        ) {
                            Text(text = "Goodbye", color = Color.Black)
                        }


                    }

                }
            }


            @Composable
            fun SetModuleLists(moduleList: List<ModulesData>, c: Context) {
                LazyColumn {
                    itemsIndexed(items = moduleList) { index, itemModule ->
                        ModuleCard(moduleData = itemModule, onClick = {
                            Toast.makeText(c, itemModule.moduleName, Toast.LENGTH_SHORT).show()

                        })
                    }
                }

            }

            @Composable
            fun alertDialog(controller: NavController){

                val activity = (LocalContext.current as? Activity)
                val openDialog = remember { mutableStateOf(true) }

                if (openDialog.value)
                {
                    AlertDialog(
                        onDismissRequest = { openDialog.value = false },
                        title = { Text(text = "AlertDialog", color = Color.Black) },
                        text = { Text(text = "leaving now?", color = Color.Black) },

                        confirmButton = {

                            TextButton(
                                onClick = {
                                    openDialog.value = false
                                    navController.navigate(Screen.Mod.route)
                                }) {
                                Text(text = "No", color = Color.Red)
                            }

                        },
                        dismissButton = {
                            TextButton(
                                onClick = {
                                    activity?.finish()

                                }) {
                                Text(text = "Yes", color = Color.Green)
                            }
                        },
                        backgroundColor = Color.DarkGray,
                        contentColor = Color.White
                    )
                }
            }
        }
    }

    private fun SetModuleLists(moduleList: List<ModulesData>, c: ModuleActivity) {

    }
}


