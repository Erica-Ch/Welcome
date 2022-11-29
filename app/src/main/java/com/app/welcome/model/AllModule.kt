package com.app.welcome.model

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.welcome.data.Modu

@Composable
fun AllModules(modList: List<Modu>) {


        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(16.dp)
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
                            modifier = Modifier.padding(top = 30.dp, start = 40.dp)
                        )
                    }
                    //Lists
                    this@LazyColumn.items(modList) { module ->
                        ModuleCard(module.name , module.type , module.duration , module.imageRes )

                    }
                }


                }
            }
        }

//@Preview
//@Composable
//fun PreviewAllModules() {
   // AllModules(modules)
//}





