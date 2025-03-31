package com.example.actividades_tareas.parcial_1

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun letra (num: Int) : Color {

    var colorLetra by remember {
        mutableStateOf(Color.Black)
    }

    if (num % 2 == 0) {
        colorLetra = Color.Blue
    } else {
        colorLetra = Color.White
    }
    if (num == 16) {
        colorLetra = Color.Green
    }
    return colorLetra
}

@Composable
fun fondo (num: Int) : Color {

    var fondo by remember {
        mutableStateOf(Color.Black)
    }

    if (num % 2 == 0) {
        fondo =  Color.White
    } else {
        fondo =  Color.Blue
    }
    if (num == 16) {
        fondo = Color.Green
    }
    return fondo
}

@Composable
fun celdasView (num1: Int, num2: Int, num3: Int, num4: Int) {

    Row (
        modifier = Modifier.fillMaxWidth()
    ) {
        Box (
            modifier = Modifier
                .weight(1f)
                .height(95.dp)
                .background(color = fondo(num1))
                .border(width = 2.dp, color = Color.Black)
        ) {
            Text("$num1",
                color = letra(num1),
                fontSize = 50.sp,
                fontFamily = FontFamily.Serif,
                modifier = Modifier
                    .align(Alignment.Center)
            )
        }
        Box (
            modifier = Modifier
                .weight(1f)
                .height(95.dp)
                .background(color = fondo(num2))
                .border(width = 2.dp, color = Color.Black)
        ) {
            Text("$num2",
                color = letra(num2),
                fontSize = 50.sp,
                fontFamily = FontFamily.Serif,
                modifier = Modifier
                    .align(Alignment.Center)
            )
        }
        Box (
            modifier = Modifier
                .weight(1f)
                .height(95.dp)
                .background(color = fondo(num3))
                .border(width = 2.dp, color = Color.Black)
        ) {
            Text("$num3",
                color = letra(num3),
                fontSize = 50.sp,
                fontFamily = FontFamily.Serif,
                modifier = Modifier
                    .align(Alignment.Center)
            )
        }
        Box (
            modifier = Modifier
                .weight(1f)
                .height(95.dp)
                .background(color = fondo(num4))
                .border(width = 2.dp, color = Color.Black)
        ) {
            Text("$num4",
                color = letra(num4),
                fontSize = 50.sp,
                fontFamily = FontFamily.Serif,
                modifier = Modifier
                    .align(Alignment.Center)
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun NumberView () {

    Column (
        modifier = Modifier
            .width(400.dp)
            .height(400.dp)
            .border(width = 10.dp, color = Color(0xFFCD701F))
            .padding(10.dp)
    ) {

        celdasView(1,2,3,4)
        celdasView(5,6,7,8)
        celdasView(9,10,11,12)
        celdasView(13,14,15,16)

    }

}