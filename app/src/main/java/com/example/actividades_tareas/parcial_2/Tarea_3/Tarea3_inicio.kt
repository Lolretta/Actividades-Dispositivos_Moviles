package com.example.actividades_tareas.parcial_2.Tarea_3

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.actividades_tareas.R

@Composable
fun Tarea3_Inicio_View (navegar: NavController) {

    Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {

        Text(text = "Bienvenido al inicio de la tarea 3 :) ")

        Image(painter = painterResource(id = R.drawable.gordito),
            contentDescription = "dividir",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(100.dp)
                .padding(5.dp)
                .clickable{navegar.navigate("Tarea")})

    }
}

@Preview(showBackground = true)
@Composable
fun Tarea3_Inicio_Preview () {
    val nav = rememberNavController()
    Tarea3_Inicio_View(nav)
}