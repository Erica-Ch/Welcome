package com.app.welcomescreen
/*
Ngonidzaishe Erica Chipato
218327315
Practical 03
 */

import android.view.Surface
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

fun ModuleCard(
     moduleData:ModulesData, onClick: () ->Unit
) {
    Card(
        modifier = Modifier
            .padding(
                bottom = 9.dp,
                top = 9.dp,
                start = 5.dp,
                end = 5.dp

            )
            .fillMaxWidth()
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(19.dp),
        elevation = 16.dp
    ) {
        Row(
            modifier = Modifier
                .clip(RoundedCornerShape(4.dp))
                .background(MaterialTheme.colors.surface)


        ) {
            Surface(
                modifier = Modifier.size(size = 130.dp),
                shape = RoundedCornerShape(16.dp),
                color = MaterialTheme.colors.onSurface.copy(alpha = 0.2f)
            ) {
               Image(painter = painterResource(
                   id =moduleData.moduleImg),
                   contentDescription = null,
                   modifier = Modifier
                       .height(120.dp)
                       .clip(shape = RoundedCornerShape(15.dp)),
                   contentScale = ContentScale.Crop
               )
            }
            Column (
                modifier = Modifier
                    .padding(start = 12.dp)
                    .align(Alignment.CenterVertically)
                    ){
                  Text(text = moduleData.moduleName,
                      fontWeight = FontWeight.Bold,
                      style = TextStyle(fontSize = 22.sp )
                  , color = Color.Blue
                      )
                CompositionLocalProvider(
                     LocalContentAlpha provides ContentAlpha.medium) {
                    Text(text = moduleData.moduleType,
                        style = typography.body1,
                        maxLines = 2, overflow = TextOverflow.Visible,
                        modifier = Modifier.padding(end = 25.dp)
                    )

                    Text(text = moduleData.moduleDuration,
                        style = typography.body1,
                        maxLines = 2, overflow = TextOverflow.Visible,
                        modifier = Modifier.padding(end = 25.dp)
                    )

                }

            }

        }

    }
}