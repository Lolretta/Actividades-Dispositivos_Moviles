package com.example.holamundo

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PosicionesView () {

    Column (
        modifier = Modifier
            .fillMaxSize()
            .border(width = 10.dp, color = Color.Black)
            .padding(10.dp)
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Box (
                modifier = Modifier
                    .background(color = Color.Red)
                    .weight(1f)
            ) {
                Text("Top Start", color = Color.White, modifier = Modifier
                    .align(alignment = Alignment.TopStart))
            }
            Box (
                modifier = Modifier
                    .background(color = Color.Blue)
                    .weight(1f)
                    .padding(bottom = 170.dp)
            ) {
                Text("Top", color = Color.White, modifier = Modifier
                    .align(alignment = Alignment.TopCenter))
            }
            Box (
                modifier = Modifier
                    .background(color = Color.Magenta)
                    .weight(1f)
            ) {
                Text("Top End", color = Color.White, modifier = Modifier
                    .align(alignment = Alignment.TopEnd))
            }
        }
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Box (
                modifier = Modifier
                    .background(color = Color.Green)
                    .padding(top = 50.dp, end = 75.dp, bottom = 70.dp)
            ) {
                Text("Center Start", modifier = Modifier
                    .align(alignment = Alignment.CenterStart))
            }
            Box (
                modifier = Modifier
                    .background(color = Color.Gray)
                    .padding(top = 170.dp, bottom = 200.dp)
                    .weight(.5f)
            ) {
                Text("Center", modifier = Modifier
                    .align(alignment = Alignment.Center))
            }
            Box (
                modifier = Modifier
                    .background(color = Color.Black)
                    .weight(1f)
            ) {
                Text("Center End", color = Color.White,modifier = Modifier
                    .align(alignment = Alignment.CenterEnd))
            }
        }
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Box (
                modifier = Modifier
                    .background(color = Color.Cyan)
                    .padding(top = 237.dp, end = 5.dp, bottom = 5.dp)
            ) {
                Text("Bottom Start", modifier = Modifier
                    .align(alignment = Alignment.BottomStart))
            }
            Box (
                modifier = Modifier
                    .background(color = Color.DarkGray)
                    .padding(top = 237.dp, bottom = 5.dp)
                    .weight(2f)
            ) {
                Text("Bottom", color = Color.White, modifier = Modifier
                    .align(alignment = Alignment.BottomCenter))
            }
            Box (
                modifier = Modifier
                    .background(color = Color.Yellow)
                    .padding(top = 237.dp, bottom = 5.dp)
                    .weight(1f)
            ) {
                Text("Bottom End", modifier = Modifier
                    .align(alignment = Alignment.BottomEnd))
            }
        }
    }
}