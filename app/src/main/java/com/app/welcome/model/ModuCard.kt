package com.app.welcome.model


import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image


@Composable
fun ModuleCard (name:String, type: String, duration:String,imageRes:Int){

    Card (
        modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth()
       .wrapContentHeight(),
        shape = MaterialTheme.shapes.medium,
        elevation = 5.dp,
        backgroundColor = MaterialTheme.colors.surface
            ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                modifier = Modifier.size(200.dp)
                    .padding(8.dp),
                contentScale = ContentScale.Fit,
            )
            Column(Modifier.padding(8.dp)) {
                Text(
                    text = name,
                    style = MaterialTheme.typography.h5,
                    color = MaterialTheme.colors.onSurface,
                )
                Text(
                    text = type,
                    style = MaterialTheme.typography.body2,
                )
                Text(
                    text = duration,
                    style = MaterialTheme.typography.body2,
                )

            }
        }
    }

}

//@Composable
//fun Image(painter: Painter, contentDescription: Nothing?, modifier: Modifier, contentScale: ContentScale) {


//}
